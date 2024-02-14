package com.springboot.Telemedicine.services;

import com.springboot.Telemedicine.entites.User;

public interface UserService {
    User add(User user);
    User get(Long id);
}
