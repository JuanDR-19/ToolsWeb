package com.example.demo.Entities;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Tool implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String img;
    private String description;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand_id;
    private double price;

    @ManyToMany
    private List<City> cities;

    private Integer quantity;

}
