package com.github.leebhm.fluxex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FluxExApplication

fun main(args: Array<String>) {
	runApplication<FluxExApplication>(*args)
}
