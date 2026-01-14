package com.kaykamaral.SpringStudies.services;

import com.kaykamaral.SpringStudies.entities.Order;
import com.kaykamaral.SpringStudies.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Integer id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}