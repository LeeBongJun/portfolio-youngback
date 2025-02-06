package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository  : JpaRepository<Project, Long>  {
}