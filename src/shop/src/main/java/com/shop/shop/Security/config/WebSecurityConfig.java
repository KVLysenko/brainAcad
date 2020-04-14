package com.shop.shop.Security.config;

import com.shop.shop.Security.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder(8);
    }

    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception{
        return authenticationManager();
    }

    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/resources/**", "/registration", "/css/**").permitAll()
//                .antMatchers("/product/**").hasRole("Admin")
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated().and()
                .formLogin()
             .loginPage("/login")
                .usernameParameter("email")
                .passwordParameter("password")
                .permitAll()
                .failureUrl("/login?error=true")
//                .successForwardUrl("/index")
             .and()
             .httpBasic()
             .and()
             .logout()
             .permitAll();
    }
}
