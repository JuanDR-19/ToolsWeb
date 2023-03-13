package com.example.demo.Repositories;
import com.example.demo.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface CityRepository extends JpaRepository<City, Integer> {

    //@Query("UPDATE cities t SET t.name = :name where t.id = :id")
    //void updateCity(@Param("name") String name, @Param("id") Integer id);
}
