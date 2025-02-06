package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction , Long>{
}