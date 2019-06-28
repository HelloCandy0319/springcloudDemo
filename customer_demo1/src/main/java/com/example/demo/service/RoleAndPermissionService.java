package com.example.demo.service;

import com.example.demo.entity.RoleAndPermission;
import com.example.demo.repository.RoleAndPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleAndPermissionService {
    @Autowired
    private RoleAndPermissionRepository roleAndPermissionRepository;

    public List<RoleAndPermission> findPermissionByRoleId(Long roleId){
        return roleAndPermissionRepository.findByRoleId(roleId);
    }

    public List<RoleAndPermission> findAll(){
        return roleAndPermissionRepository.findAll();
    }


}
