package com.service;

import com.Entity.User;
import com.repo.UserRepo;

public class UserService implements UserRepo {
    @Override
    public User save(User user) {
        for (int i = 0; i < 2; i++) {

        }
        return null;
    }
}
