package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ExperienceRepository : JpaRepository<Experience, Long> {


    fun findAllByIsActive(isActive: Boolean): List<Experience>

    override fun findById(id: Long): Optional<Experience>

}