package com.github.leebhm.fluxex.controller

import com.github.leebhm.fluxex.entity.UserEntity
import com.github.leebhm.fluxex.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController (val userRepository: UserRepository) {

    @GetMapping
    fun getUsers(): MutableList<UserEntity> = userRepository.findAll()

    @GetMapping("/{name}")
    fun getUser(@PathVariable name: String) = userRepository.findById(name)

    @PostMapping
    fun addUser(@RequestBody user:UserEntity) = userRepository.save(user)

    @DeleteMapping("/{name}")
    fun deleteUser(@PathVariable name: String) = userRepository.deleteById(name)

}