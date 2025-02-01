package com.elifcan.j055_springbootdatajpa.service;

import com.elifcan.j055_springbootdatajpa.entity.Custumer;
import com.elifcan.j055_springbootdatajpa.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // gerekli olan constructorları ekle
public class CustomerService {

    private final CustomerRepository repository;

    public void save(Custumer customer){
        repository.save(customer);
    }
    public List<Custumer> getAllCustomer(){
        return repository.findAll();
    }

}
