package com.elifcan.j055_springbootdatajpa.controller;

import com.elifcan.j055_springbootdatajpa.entity.Customer;
import com.elifcan.j055_springbootdatajpa.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add-customer")
    public ResponseEntity<Void> addCustomer(String name, String surname, String phone){
        Customer customer = Customer.builder()
                .name(name)
                .surname(surname)
                .phone(phone)
                .build();
        customerService.save(customer);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> customerList = customerService.getAllCustomer();
        return ResponseEntity.ok().body(customerList);
    }

    @GetMapping("/get-by-name")
    public ResponseEntity<List<Customer>> getCustomerByName(String name){
        return ResponseEntity.ok(customerService.getCustomerByName(name));
    }

}
