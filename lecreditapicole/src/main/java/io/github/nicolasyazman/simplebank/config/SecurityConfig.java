package io.github.nicolasyazman.simplebank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll()  // Allow H2 Console
                .requestMatchers("/api/users/**").permitAll()
                .requestMatchers("/api/userscomment/**").permitAll()
                .anyRequest().authenticated()
            )
            .headers(headers -> headers.frameOptions().disable())  // Fix H2 iframe issue
            .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"));  // Disable CSRF for H2
       
        return http.build();
    }
}