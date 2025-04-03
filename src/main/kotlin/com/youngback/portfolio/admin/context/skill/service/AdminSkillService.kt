package com.youngback.portfolio.admin.context.skill.service

import com.youngback.portfolio.admin.context.link.form.LinkForm
import com.youngback.portfolio.admin.context.skill.form.SkillForm
import com.youngback.portfolio.admin.data.TableDTO
import com.youngback.portfolio.domain.entity.Skill
import com.youngback.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminSkillService(
    private val skillRepository: SkillRepository
) {

    fun getSkillTable() : TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo , entities)
    }

    @Transactional
    fun save(form: SkillForm) {
        val link = form.toEntity()
        skillRepository.save(link)
    }

    @Transactional
    fun update(id: Long, form: SkillForm) {
        val link = form.toEntity(id)
        skillRepository.save(link)
    }

}