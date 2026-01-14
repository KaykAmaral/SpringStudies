package com.kaykamaral.SpringStudies.repositories;

import com.kaykamaral.SpringStudies.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {



}