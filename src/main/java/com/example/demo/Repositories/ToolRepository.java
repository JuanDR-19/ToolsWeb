package com.example.demo.Repositories;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import com.example.demo.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.net.URL;
import java.util.ArrayList;


public interface ToolRepository extends JpaRepository<Tool, Integer> {

    @Modifying //update
    @Query("UPDATE Tool t SET t.name = :name, t.img = :img, t.description = :description, t.brand = :brand, t.price = :price, t.cities = :cities, t.quantity = :quantity WHERE t.id = :id")
    void actualizarTool(@Param("name") String name, @Param("img") URL img, @Param("description") String description, @Param("brand") Brand brand, @Param("price") double price, @Param("cities") ArrayList<City> cities, @Param("quantity") Integer quantity, @Param("id") Integer id);
    ArrayList<Tool> findAll();
}
