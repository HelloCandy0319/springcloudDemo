package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserDetailServiceImpl implements UserDetailsService  {

    @Autowired
   private UserService userService;
    @Autowired
    private UserAndRoleService userAndRoleService;
    @Autowired
    private RoleAndPermissionService roleAndPermissionService;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private RoleService roleService;


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userService.findUserByName(name);
        if (user==null){
            throw new RuntimeException("There is no such user");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        List<UserAndRole> userAndRoles = userAndRoleService.findByUserId(user.getId());
        for (UserAndRole userAndRole:userAndRoles){
            authorities.add(new SimpleGrantedAuthority(userAndRole.getRoleId()+""));
        }

        if (authorities.size()==0){
            throw new RuntimeException("Operation without permission");
        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
       return userDetails;
    }
}
