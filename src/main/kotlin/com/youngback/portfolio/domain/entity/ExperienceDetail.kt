package com.youngback.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail(content : String , isActive : Boolean) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experiencedetail_id")
    var id : Long? = null

    var content : String = content

    var isActive : Boolean = isActive

    fun update(content : String , isActive : Boolean){
        this.content = content
        this.isActive  = isActive
    }

    @OneToMany(targetEntity = ExperienceDetail::class, fetch = FetchType.LAZY , cascade = [CascadeType.ALL])
    @JoinColumn(name = "experience_id")
    var details : MutableList<ExperienceDetail> = mutableListOf()

}