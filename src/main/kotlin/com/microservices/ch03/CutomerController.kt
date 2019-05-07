package com.microservice.ch03

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap

@RestController
class CustomerController {

//    @Autowired
////    lateinit var customers : ConcurrentHashMap<Int, Customer>
//    private lateinit var customerService: CustomerService
//
////    @GetMapping(value="/customer")
////    fun getCustomer() = "hello from a controller"
////    fun getCustomer() = Customer(1, "Kotlin")
////    fun getCustomer() = customers[2]
//
//    @GetMapping(value="/customer/{id}")
//    fun getCustomer(@PathVariable id: Int) = ResponseEntity(customerService.getCustomer(id), HttpStatus.OK)
//
//    @PostMapping(value="/customer")
//    fun createCustomer(@RequestBody customer: Customer) : ResponseEntity<Unit> {
////        customers[customer.id] = customer
//        customerService.createCustomer(customer)
//        return ResponseEntity(Unit, HttpStatus.CREATED)
//    }
//    @GetMapping(value="/customers")
////    fun getCustomers() = customers.map(Map.Entry<Int, Customer>::value).toList()
////    fun getCustomers(@RequestParam(required = false, defaultValue="") nameFilter: String) = customers.filter {
////        it.value.name.contains(nameFilter,true)
////    }.map(Map.Entry<Int, Customer>::value).toList()
//    fun getCustomer(@RequestParam(required = false, defaultValue = "") nameFilter: String) {
//        customerService.searchCustomers(nameFilter)
//    }
//
//    @DeleteMapping(value="/customer/{id}")
////    fun deleteCustomer(@PathVariable id: Int) = customers.remove(id)
//    fun deleteCustomer(@PathVariable id: Int) {
//        customerService.deleteCustomer(id)
//    }
//
//    @PutMapping(value="/customer/{id}")
////    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer) {
////        customers.remove(id)
////        customers[customer.id] = customer
////    }
//    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer) {
//        customerService.updateCustomer(id, customer)
//    }



}