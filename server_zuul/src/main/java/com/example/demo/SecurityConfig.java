package com.example.demo;

import com.example.demo.service.UserFilterSecurityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    JwtAuthenticationConfig jwtAuthenticationConfig;
    @Bean
    public JwtAuthenticationConfig jwtConfig(){
        return new JwtAuthenticationConfig();
    }

    @Autowired
    private UserDetailServiceImpl userDetailServiceImpl;

    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserAuthenticationFailureHandler userAuthenticationFailureHandler;
    @Autowired
    private UserAuthenticationSuccessHandler userAuthenticationSuccessHandler;
    @Autowired
    private UserFilterSecurityInterceptor userFilterSecurityInterceptor;



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()   //使用表单登录页面
                .loginPage("/login")//登录url
                .successHandler(userAuthenticationSuccessHandler)
                .failureHandler(userAuthenticationFailureHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/register", "/doRegister", "/login","/login/invalid").permitAll()
                .anyRequest().authenticated()//设置除了以上的url之外 其他的需要登录才可以
                .and().rememberMe()
                .tokenRepository(persistentTokenRepository())
                // 有效时间：单位s
                .tokenValiditySeconds(60)
                .userDetailsService(userDetailsService())
                .and()
                .csrf().disable();
        http.addFilterBefore(userFilterSecurityInterceptor, FilterSecurityInterceptor.class);
        http.
                sessionManagement()
                .invalidSessionUrl("/login/invalid")
                .maximumSessions(1)
                // 当达到最大值时，是否保留已经登录的用户
                .maxSessionsPreventsLogin(false)
                .expiredSessionStrategy(new UserSessionInformationExpiredStrategy());
    }
//加密
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
           auth.userDetailsService(userDetailServiceImpl).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
            jdbcTokenRepository.setDataSource(dataSource);
            return jdbcTokenRepository;
    }


    protected PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
