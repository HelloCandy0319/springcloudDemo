package com.example.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JwtTokenAuthenticationFilter extends OncePerRequestFilter {

    private JwtAuthenticationConfig config;

    public JwtTokenAuthenticationFilter(JwtAuthenticationConfig config) {
        this.config = config;
    }
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String token = httpServletRequest.getHeader(config.getHeader());
        if (token!=null && token.startsWith(config.getPrefix()+" ")){
            token = token.replace(config.getPrefix()+" "," ");
            try {
                //JWT Token中获取了载荷
                Claims claims = Jwts.parser()
                        //用于设置JWT的签名key，用户后面对JWT进行解析。
                        .setSigningKey(config.getSecret().getBytes())
                        .parseClaimsJws(token)
                        .getBody();
                String username = claims.getSubject();
                List<String> authorities = claims.get("authorities", List.class);
                if (username!=null){
                    //当在页面中输入用户名和密码之后首先会进入到UsernamePasswordAuthenticationToken验证
                    UsernamePasswordAuthenticationToken passwordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                           username,null,authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
                    //然后生成的Authentication会被交由AuthenticationManager来进行管理
                    SecurityContextHolder.getContext().setAuthentication(passwordAuthenticationToken);
                }
            }catch (Exception e){
                SecurityContextHolder.clearContext();
            }
            filterChain.doFilter(httpServletRequest,httpServletResponse);
        }

    }
}
