package com.youngback.portfolio.admin.context.introduction.service

import com.youngback.portfolio.admin.data.TableDTO
import com.youngback.portfolio.domain.entity.Introduction
import com.youngback.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable() : TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo , entities)
    }

}