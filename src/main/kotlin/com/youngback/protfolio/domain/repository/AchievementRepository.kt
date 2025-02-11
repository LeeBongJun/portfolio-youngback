package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {


    // select from achievement where is_active = :isActive
    fun fundAllByIsActive(isActive : Boolean): List<Achievement>

}