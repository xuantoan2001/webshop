package com.phamxuantoan.webshop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "admin")
public class AdminEntity extends BaseEntity {
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "level")
    private Integer level;
}
