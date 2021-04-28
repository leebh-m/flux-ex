package com.github.leebhm.fluxex.repository

import com.github.leebhm.fluxex.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, String> {
}