package com.youngback.protfolio.domain.repository

import com.youngback.protfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {

    fun countAllByCreatedDateTimeBetween(start : LocalDate, end : LocalDate) : Long

}