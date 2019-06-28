package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "role_permission")
@Data
@Entity
public class RoleAndPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "role_id")
    @NotNull
    private Long roleId;
    @Column(name = "permission_id")
    @NotNull
    private Long permissionId;
}
