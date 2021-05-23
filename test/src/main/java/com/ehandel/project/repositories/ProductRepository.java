package com.lektiontest.test.repositories;

import java.util.List;

import com.lektiontest.test.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, String> {
    List<Products> findTop9ByOrderByProductnameAsc();
}
