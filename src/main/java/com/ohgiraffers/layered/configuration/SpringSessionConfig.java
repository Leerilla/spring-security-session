package com.ohgiraffers.layered.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSessionConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.formLogin()
                // 로그인을 진행할 페이지 필드명을 맞추야 한다.
                .loginPage("/login")
                // 로그인 성공시 아래의 페이지로 요청을 보냄
                .defaultSuccessUrl("/hello")
                //login 페이지에서 전달하는 사용자의 파라미터 값
                .usernameParameter("user")
                // login 페이지에서 전달하는 사용자의 패스워드 값
                .passwordParameter("pass");
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user@gmail.com")
                .password("password")
                .roles("USER")
                .build();

        System.out.println(user.getPassword());
        return new InMemoryUserDetailsManager(user);
    }
}
