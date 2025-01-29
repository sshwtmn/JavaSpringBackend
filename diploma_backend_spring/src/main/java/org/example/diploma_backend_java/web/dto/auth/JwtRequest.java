package org.example.diploma_backend_java.web.dto.auth;

import lombok.Data;

@Data
public class JwtRequest {
    private String userName;
    private String password;

}
