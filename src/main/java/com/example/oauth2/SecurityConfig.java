package com.example.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated());
        // .oauth2ResourceServer((oauth2)-> oauth2.jwt(Customizer.withDefaults()));

        var test = JwtDecoders.fromIssuerLocation("http://localhost:4200");
        System.out.println("---"+ test);
        return http.build();
    }

    // @Bean
    // public JwtDecoder jwtDecoder(){
    // return JwtDecoders.fromIssuerLocation("http://localhost:4200");
    // }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("user")
                .password("pass")
                .roles("USER").build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}
