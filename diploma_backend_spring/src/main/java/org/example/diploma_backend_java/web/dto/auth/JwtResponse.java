package org.example.diploma_backend_java.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {
    private Long uid;
    private String userName;
    private String accessToken;
    private String refreshToken;
}
