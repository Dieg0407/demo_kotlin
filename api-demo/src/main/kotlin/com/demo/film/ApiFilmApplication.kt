package com.demo.film

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiFilmApplication

fun main(args: Array<String>) {
	runApplication<ApiFilmApplication>(*args)
}
