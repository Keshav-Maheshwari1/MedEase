package com.springboot.Telemedicine.repositories;

import com.springboot.Telemedicine.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
