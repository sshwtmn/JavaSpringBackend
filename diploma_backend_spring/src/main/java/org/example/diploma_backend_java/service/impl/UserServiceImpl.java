package org.example.diploma_backend_java.service.impl;

import org.example.diploma_backend_java.domain.user.User;
import org.example.diploma_backend_java.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
