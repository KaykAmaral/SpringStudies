package com.kaykamaral.SpringStudies.services;

import com.kaykamaral.SpringStudies.entities.Category;
import com.kaykamaral.SpringStudies.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServie {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){ return repository.findAll(); }

    public Category findById(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}