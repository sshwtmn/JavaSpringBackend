package org.example.diploma_backend_java.repository;

import org.example.diploma_backend_java.domain.user.Role;
import org.example.diploma_backend_java.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  {
    Optional<User> findUserByUid(Long uid);
    Optional<User> findUserByUsername(String username);
    void updateUser(User user);
    void createUser(User user);
    void deleteUser(Long uid);
    void setUserRole(Long uid, Role role);
}
