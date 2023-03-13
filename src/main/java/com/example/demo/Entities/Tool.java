package com.example.demo.Entities;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tools")
@Data
public class Tool implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String img;
    private String description;
    @ManyToOne
    private Brand brand;
    private double price;
    @OneToMany
    private ArrayList<City> cities;
    private Integer quantity;


}
