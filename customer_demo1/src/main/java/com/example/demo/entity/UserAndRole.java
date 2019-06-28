package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "role_user")
@Entity
@Data
public class UserAndRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long roleId;
}
