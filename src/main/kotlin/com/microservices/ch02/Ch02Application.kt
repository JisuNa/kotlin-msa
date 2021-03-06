package com.microservices.ch02

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class Ch02Application {
    @Bean
    @ConditionalOnExpression("#{'\${service.message.type}' == 'simple'}")
    fun exampleService() : ServiceInterface = ExampleService()

    @Bean
    @ConditionalOnExpression("#{'\${service.message.type}' == 'advance'}")
    fun advanceService() : ServiceInterface = AdvanceService()
}

@Controller
class FirstController() {

    @Autowired
    lateinit var service : ServiceInterface

    @GetMapping(value = ["/user/{name}"])
    @ResponseBody
    fun hello(@PathVariable name: String)=service.getHello(name)
}

fun main(args: Array<String>) {
    runApplication<Ch02Application>(*args)
}


