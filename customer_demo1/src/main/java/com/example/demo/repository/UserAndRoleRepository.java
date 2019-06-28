package com.example.demo.repository;

import com.example.demo.entity.UserAndRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAndRoleRepository extends JpaRepository<UserAndRole,Long> {
    List<UserAndRole> findByUserId(Long id);
}
