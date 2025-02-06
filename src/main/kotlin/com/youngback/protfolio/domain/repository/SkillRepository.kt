package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {
}