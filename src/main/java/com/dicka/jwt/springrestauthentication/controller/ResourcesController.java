package com.dicka.jwt.springrestauthentication.controller;

import com.dicka.jwt.springrestauthentication.model.City;
import com.dicka.jwt.springrestauthentication.model.Users;
import com.dicka.jwt.springrestauthentication.services.GenericServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/springjwt")
public class ResourcesController {

    @Autowired
    private GenericServices userServices;

    @RequestMapping(value = "/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<City> getUsers(){
        return userServices.findAllCity();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<Users> getUserss(){
        return userServices.findAllUsers();
    }
}
