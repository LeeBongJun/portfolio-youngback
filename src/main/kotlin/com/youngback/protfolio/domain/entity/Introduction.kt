package com.youngback.protfolio.domain.entity

import jakarta.persistence.*

@Entity
class Introduction(
    content : String ,
    isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intoduction_id")
    var id : Long? = null

    var content : String = content

    var isActive : Boolean = isActive

}