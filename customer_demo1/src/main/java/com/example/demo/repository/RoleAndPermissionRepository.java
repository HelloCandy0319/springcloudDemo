package com.example.demo.repository;

import com.example.demo.entity.RoleAndPermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleAndPermissionRepository extends JpaRepository<RoleAndPermission,Long> {
    List<RoleAndPermission> findByRoleId(Long roleId);
    RoleAndPermission findByPermissionId(Long permissionId);
}
