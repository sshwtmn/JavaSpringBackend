package org.example.diploma_backend_java.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults());
//                .authorizeHttpRequests((auth) -> auth.requestMatchers("/registration","/public/greeting", "/public/login").permitAll())
//                .authorizeHttpRequests((auth) -> auth.requestMatchers("/user/**").hasAuthority("ROLE_USER"))
//                .authorizeHttpRequests((auth) -> auth.requestMatchers("/admin/**").hasAnyAuthority("ROLE_ADMIN", "ROLE_SUPER"))
//                .authorizeHttpRequests((auth) -> auth.requestMatchers("/private/greeting", "/private/greeting-name", "/private/greeting-name2").authenticated())
//                .authorizeHttpRequests((auth) -> auth.requestMatchers("/private/greetingAnyAuthority").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN"));
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
