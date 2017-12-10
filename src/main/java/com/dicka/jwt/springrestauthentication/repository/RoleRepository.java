package com.dicka.jwt.springrestauthentication.repository;

import com.dicka.jwt.springrestauthentication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
}
