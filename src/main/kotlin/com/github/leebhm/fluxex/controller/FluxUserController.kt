package com.github.leebhm.fluxex.controller

import com.github.leebhm.fluxex.entity.UserEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.reactive.function.client.WebClient




@RestController
@RequestMapping("/flux")
class FluxUserController {
    val client = WebClient.create("http://localhost:8080")

    @GetMapping("/user/{name}")
    fun getUser(@PathVariable name: String) =
        client.get()
            .uri("/user/{name}", name)
            .retrieve()
            .bodyToMono(UserEntity::class.java)

    @GetMapping("/user")
    fun getUsers() =
        client.get()
            .uri("/user")
            .retrieve()
            .bodyToFlux(UserEntity::class.java)
}