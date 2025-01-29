package org.example.diploma_backend_java.repository.impl;

import org.example.diploma_backend_java.domain.user.Role;
import org.example.diploma_backend_java.domain.user.User;
import org.example.diploma_backend_java.repository.UserRepository;

import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findUserByUid(Long uid) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUser(Long uid) {

    }

    @Override
    public void setUserRole(Long uid, Role role) {

    }
}
