package com.example.demo.Repositories;

import com.example.demo.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;


public interface CityRepository extends JpaRepository<City, Integer> {

}
