package com.lektiontest.test.repositories;

import com.lektiontest.test.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {}
