package com.example.demo.service;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
@Service
public class UserAccessDecisionManager implements AccessDecisionManager{
    // decide 方法是判定是否拥有权限的决策方法，
    //authentication 是释UserServiceImpl中循环添加到 GrantedAuthority 对象中的权限信息集合.
    //object 包含客户端发起的请求的requset信息，可转换为 HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
    //configAttributes 为MyInvocationSecurityMetadataSource的getAttributes(Object object)这个方法返回的结果，
    // 此方法是为了判定用户请求的url 是否在权限表中，
    // 如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
            if (null==collection || collection.size()<=0){
                return;
            }
            ConfigAttribute configAttribute;
            String needRole;
            int count = 0;
            for(Iterator<ConfigAttribute> iter = collection.iterator(); iter.hasNext(); ) {
                configAttribute = iter.next();
                needRole = configAttribute.getAttribute();
                for (GrantedAuthority grantedAuthority:authentication.getAuthorities()){
                    if (needRole.trim().equals(grantedAuthority.getAuthority())){
                        count ++;
                        return;
                    }
                }
            }
            if (count==0){
                throw new RuntimeException("no permission");
            }
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
