package com.example.demo.Entities;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;

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
    private City cities;
    private Integer quantity;


}
