package com.me.springsec24app.dao;

import com.me.springsec24app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
