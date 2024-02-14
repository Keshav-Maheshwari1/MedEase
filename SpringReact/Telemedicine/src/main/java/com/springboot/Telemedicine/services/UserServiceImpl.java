package com.springboot.Telemedicine.services;

import com.springboot.Telemedicine.entites.User;
import com.springboot.Telemedicine.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepositories;
    @Override
    public User add(User user) {
        return userRepositories.save(user);
    }

    @Override
    public User get(Long id) {
        return userRepositories.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
    }
}
