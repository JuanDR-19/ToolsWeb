package com.example.demo.Entities;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tool implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String img;
    private String description;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand_id;
    private double price;
    @ManyToMany(mappedBy = "tool")
    private ArrayList<City> city_id;
    private Integer quantity;

}
