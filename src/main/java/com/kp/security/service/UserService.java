package com.kp.security.service;

import com.kp.security.entities.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
