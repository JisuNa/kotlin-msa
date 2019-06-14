package com.microservice.ch09

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.amshove.kluent.*
import org.junit.Test

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest
class CustomerServiceTest {

    @Autowired
    lateinit var customerService: CustomerService

    @Test
    fun `we should get a customer with a valid id`() {
        val customer = customerService.getCustomer(1)
        customer.`should not be null`()
        customer?.name `should be` "Kotlin"
    }

    @Test
    fun `sdasdasd`() {
        val customers = customerService.getAllCustomers()
        customers.size `should equal to` 3
        customers.size `should be greater than` 0
        customers.size `should be less or equal to` 3
        customers.size `should be in range` 1..3
    }
}