package com.microservices.ch05

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl :CustomerService {

    @Autowired lateinit var customerRepository: CustomerRepository

    override fun getCustomer(id:Int) = customerRepository.findById(id)
}