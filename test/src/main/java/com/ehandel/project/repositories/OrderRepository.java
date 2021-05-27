package com.ehandel.project.repositories;

import com.ehandel.project.entities.Orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
