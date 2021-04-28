package com.github.leebhm.fluxex.entity

import javax.persistence.*

@Entity
data class UserEntity (
    @Id val name: String,
    val phone: String
)