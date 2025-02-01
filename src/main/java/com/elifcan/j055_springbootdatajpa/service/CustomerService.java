package com.elifcan.j055_springbootdatajpa.service;

import com.elifcan.j055_springbootdatajpa.entity.Customer;
import com.elifcan.j055_springbootdatajpa.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // gerekli olan constructorları ekle
public class CustomerService {

    private final CustomerRepository repository;

    public void save(Customer customer){
        repository.save(customer);
    }

    public List<Customer> getAllCustomer(){
        return repository.findAll();
    }

    public List<Customer> getCustomerByName(String name){
        return repository.findAllByName(name);
    }

}
