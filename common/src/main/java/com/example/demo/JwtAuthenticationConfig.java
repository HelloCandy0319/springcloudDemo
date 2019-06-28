package com.example.demo;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;


@Getter
@ToString
public class JwtAuthenticationConfig {
    @Value("${demo.security.jwt.url:/callerDemo1/user/hi}")
    private String url;

    @Value("${demo.security.jwt.header:Authorization}")
    private String header;

    @Value("${demo.security.jwt.prefix:Bearer}")
    private String prefix;

    @Value("${demo.security.jwt.expiration:#{24*60*60}}")
    private int expiration; // default 24 hours

    @Value("${demo.security.jwt.secret}")
    private String secret;
}
