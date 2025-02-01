package com.elifcan.j055_springbootdatajpa.repository;

import com.elifcan.j055_springbootdatajpa.entity.Custumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Custumer, Long> {
}
