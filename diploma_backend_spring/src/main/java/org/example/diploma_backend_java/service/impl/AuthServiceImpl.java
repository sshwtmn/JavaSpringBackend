package org.example.diploma_backend_java.service.impl;

import org.example.diploma_backend_java.service.AuthService;
import org.example.diploma_backend_java.web.dto.auth.JwtRequest;
import org.example.diploma_backend_java.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
