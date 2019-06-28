package com.example.demo.service;

import com.example.demo.entity.Permission;
import com.example.demo.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
    @Autowired
   private PermissionRepository permissionRepository;

    public Permission findPermissionById(Long id){
        return permissionRepository.findOne(id);
    }
}
