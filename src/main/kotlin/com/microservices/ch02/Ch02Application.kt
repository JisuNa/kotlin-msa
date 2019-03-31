package com.microservices.ch02

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Ch02Application

fun main(args: Array<String>) {
    runApplication<Ch02Application>(*args)
}
