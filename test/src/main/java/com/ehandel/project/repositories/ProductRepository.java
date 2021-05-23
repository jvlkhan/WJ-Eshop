package com.ehandel.project.repositories;

import java.util.List;

import com.ehandel.project.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, String> {
    List<Products> findTop9ByOrderByProductnameAsc();
}
