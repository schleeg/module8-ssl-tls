package edu.canisius.cyb600.module8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class X509AuthenticationServer {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .permitAll()
                .and()
                .x509()
                .subjectPrincipalRegex("CN=(.*?)(?:,|$)");
        return http.build();
    }
    public static void main(String[] args) {
        SpringApplication.run(X509AuthenticationServer.class, args);
    }
}