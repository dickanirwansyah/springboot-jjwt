package com.dicka.jwt.springrestauthentication.detailservices;

import com.dicka.jwt.springrestauthentication.model.Users;
import com.dicka.jwt.springrestauthentication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppUsersDetailServices implements UserDetailsService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByUsername(username);

        if(username == null){
            throw new UsernameNotFoundException(String.format("The username %s doesn't exist", username));

        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        users.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });

        UserDetails userDetails = new org.springframework.security.core
                .userdetails.User(users.getUsername(), users.getPassword(), authorities);

        return userDetails;
    }
}
