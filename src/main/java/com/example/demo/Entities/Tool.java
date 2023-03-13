package com.example.demo.Entities;
import lombok.Data;

import javax.persistence.*;
import java.net.URL;
import java.util.ArrayList;

@Entity
@Table(name = "tools")
@Data
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String name;
    private String img;
    private String description;
    @ManyToOne
    private Brand brand;
    private double price;
    @OneToMany
    private City cities;
    private Integer quantity;


}
