package com.youngback.portfolio.admin.context.introduction.service

import com.youngback.portfolio.admin.context.introduction.form.IntroductionForm
import com.youngback.portfolio.admin.data.TableDTO
import com.youngback.portfolio.domain.entity.Introduction
import com.youngback.portfolio.domain.repository.IntroductionRepository
import com.youngback.portfolio.presentation.dto.IntroductionDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable() : TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo , entities)
    }

    @Transactional
    fun save(form : IntroductionForm) {
        val introduction = form.toEntity()
        introductionRepository.save(introduction)
    }

    @Transactional
    fun update(id : Long , form : IntroductionForm) {
        val introduction = form.toEntity(id)
        introductionRepository.save(introduction)
    }

}