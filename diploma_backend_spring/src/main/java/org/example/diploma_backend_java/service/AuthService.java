package org.example.diploma_backend_java.service;

import org.example.diploma_backend_java.web.dto.auth.JwtRequest;
import org.example.diploma_backend_java.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);
}
