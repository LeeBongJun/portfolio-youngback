package com.youngback.protfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intoduction_id")
    var id : Long? = null

}