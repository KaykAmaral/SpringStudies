package com.kaykamaral.SpringStudies.repositories;

import com.kaykamaral.SpringStudies.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {



}