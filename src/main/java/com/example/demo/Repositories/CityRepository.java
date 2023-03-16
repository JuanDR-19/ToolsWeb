package com.example.demo.Repositories;
import com.example.demo.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityRepository extends JpaRepository<City, Integer> {

}
