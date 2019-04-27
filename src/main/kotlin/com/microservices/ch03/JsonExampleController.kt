package com.microservice.ch03

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JsonExampleController {

//    @GetMapping(value = "/json")
//    fun getJson() = SimpleObject()

//    @GetMapping(value = "/json")
//    fun getJson() = SimpleObject("hi", "Kotlin")
    @GetMapping(value = "/json")
    fun getJson() = ComplexObject(object1 = SimpleObject("more", "complex"))
}