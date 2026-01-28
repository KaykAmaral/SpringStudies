package com.kaykamaral.SpringStudies.services;

import com.kaykamaral.SpringStudies.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.kaykamaral.SpringStudies.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Integer id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

}