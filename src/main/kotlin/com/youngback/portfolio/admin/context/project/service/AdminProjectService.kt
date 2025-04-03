package com.youngback.portfolio.admin.context.project.service

import com.youngback.portfolio.admin.data.TableDTO
import com.youngback.portfolio.admin.exception.AdminBadRequestException
import com.youngback.portfolio.domain.entity.Project
import com.youngback.portfolio.domain.entity.ProjectDetail
import com.youngback.portfolio.domain.repository.ProjectRepository
import com.youngback.portfolio.presentation.dto.ProjectDTO
import org.springframework.stereotype.Service

@Service
class AdminProjectService(
    private val projectRepository: ProjectRepository
) {

    fun getProjectTable() : TableDTO {
        val classInfo = Project::class
        val entities = projectRepository.findAll()

        return TableDTO.from(classInfo , entities , "skills")
    }

    fun getProjectDetailTable(id : Long?) : TableDTO {
        val classInfo = ProjectDetail::class
        val entities = if ( id != null) projectRepository.findById(id)
            .orElseThrow {throw  AdminBadRequestException("ID ${id}에 해당하는 데이터를 찾을 수 없습니 다.")}
            .details else emptyList()

        return TableDTO.from(classInfo , entities)
    }

}