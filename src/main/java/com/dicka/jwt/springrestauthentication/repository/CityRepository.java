package com.dicka.jwt.springrestauthentication.repository;

import com.dicka.jwt.springrestauthentication.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
