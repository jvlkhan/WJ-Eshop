package com.lektiontest.test.repositories;

import com.lektiontest.test.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
