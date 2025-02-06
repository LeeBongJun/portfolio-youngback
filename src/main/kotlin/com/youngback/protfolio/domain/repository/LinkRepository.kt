package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {
}