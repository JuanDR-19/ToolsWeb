package com.example.demo.Repositories;

import com.example.demo.Entities.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ToolRepository extends JpaRepository<Tool, Integer> {

    //@Query("UPDATE Tool t SET t.name = :name, t.img = :img, t.description = :description, t.brand = :brand, t.price = :price, t.cities = :cities, t.quantity = :quantity WHERE t.ID = :id")
    //void actualizarTool(@Param("name") String name, @Param("img") URL img, @Param("description") String description, @Param("brand") Brand brand, @Param("price") double price, @Param("cities") ArrayList<City> cities, @Param("quantity") Integer quantity, @Param("id") Integer id);
}
