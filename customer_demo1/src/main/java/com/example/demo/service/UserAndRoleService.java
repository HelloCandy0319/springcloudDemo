package com.example.demo.service;

import com.example.demo.entity.UserAndRole;
import com.example.demo.repository.UserAndRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAndRoleService {
    @Autowired
    UserAndRoleRepository userAndRoleRepository;

    public List<UserAndRole> findByUserId(Long userId){
        return userAndRoleRepository.findByUserId(userId);
    }

}
