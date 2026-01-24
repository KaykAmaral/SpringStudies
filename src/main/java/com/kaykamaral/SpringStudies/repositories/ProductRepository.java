package com.kaykamaral.SpringStudies.repositories;

import com.kaykamaral.SpringStudies.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {



}