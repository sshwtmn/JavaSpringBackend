package org.example.diploma_backend_java.service;

import org.example.diploma_backend_java.domain.user.User;

public interface UserService {
    User getUserById(Long id);
    User getUserByUsername(String username);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
