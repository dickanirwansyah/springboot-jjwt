package com.dicka.jwt.springrestauthentication.services;

import com.dicka.jwt.springrestauthentication.model.City;
import com.dicka.jwt.springrestauthentication.model.Users;

import java.util.List;

public interface GenericServices {

    Users findByUsersname(String username);

    List<Users> findAllUsers();

    List<City> findAllCity();
}
