package com.dicka.jwt.springrestauthentication.services;

import com.dicka.jwt.springrestauthentication.model.City;
import com.dicka.jwt.springrestauthentication.model.Users;
import com.dicka.jwt.springrestauthentication.repository.CityRepository;
import com.dicka.jwt.springrestauthentication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServicesImpl implements GenericServices{

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Users findByUsersname(String username) {
        return usersRepository.findByUsername(username);
    }

    @Override
    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public List<City> findAllCity() {
        return cityRepository.findAll();
    }


}
