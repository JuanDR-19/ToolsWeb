package com.example.demo.Repositories;

import com.example.demo.Entities.Tool;
import com.example.demo.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.net.URL;
import java.util.ArrayList;


public interface ToolRepository extends JpaRepository<Tool, Integer> {

    /*
    @Modifying
    void updateTool(String name, URL img, String description, Brand brand, double price, ArrayList<String> cities, Integer quantity, Long id) {
        Query query = entityManager.createQuery("UPDATE Tool t SET t.name = :name, t.img = :img, t.description = :description, t.brand = :brand, t.price = :price, t.cities = :cities, t.quantity = :quantity WHERE t.id = :id");
        query.setParameter("name", name);
        query.setParameter("img", img);
        query.setParameter("description", description);
        query.setParameter("brand", brand);
        query.setParameter("price", price);
        query.setParameter("cities", cities);
        query.setParameter("quantity", quantity);
        query.setParameter("id", id);
        query.executeUpdate();
    }
    */
}
