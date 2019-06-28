package com.example.demo.service;

import com.example.demo.entity.Permission;
import com.example.demo.entity.RoleAndPermission;
import com.example.demo.repository.PermissionRepository;
import com.example.demo.repository.RoleAndPermissionRepository;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Service
public class UserFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private RoleAndPermissionRepository  roleAndPermissionRepository;

    @Autowired
    private RoleRepository roleRepository;

    private List<Permission> set =null;

    Collection<ConfigAttribute> array = new HashSet<>();

    //此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        if (set == null)
            loadResourceDefine();
        HttpServletRequest request = ((FilterInvocation) o).getRequest();
        String url = request.getRequestURI();

        ConfigAttribute cfg;
        if (url==null)
            return null;
        for (Permission permission:set){
            if (url.equals(permission.getUrl())){
                RoleAndPermission roleAndPermission = roleAndPermissionRepository.findByPermissionId(permission.getId());
                if (roleAndPermission!=null){
                    cfg = new SecurityConfig(roleAndPermission.getRoleId()+"");
                    array.add(cfg);
                }else{
                   throw new RuntimeException("此URL 有问题");
                }
            }
        }
        return array;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    public void loadResourceDefine(){
        set = new ArrayList<>();
//        List<SimpleGrantedAuthority> authorities = (List<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
//       for (SimpleGrantedAuthority simpleGrantedAuthority:authorities){
//         List<RoleAndPermission> roleAndPermissionList = roleAndPermissionRepository.findByRoleId(Long.parseLong(simpleGrantedAuthority.getAuthority())) ;
//         for (RoleAndPermission roleAndPermission:roleAndPermissionList){
//             Permission permission = permissionRepository.findOne(roleAndPermission.getPermissionId());
//             set.add(permission);
//         }
//       }
          set = permissionRepository.findAll();

    }
}
