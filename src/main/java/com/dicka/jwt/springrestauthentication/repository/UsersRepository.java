package com.dicka.jwt.springrestauthentication.repository;

import com.dicka.jwt.springrestauthentication.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
