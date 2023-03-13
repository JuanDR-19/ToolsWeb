package com.example.demo.Entities;

import lombok.Data;

import javax.persistence.*;



@Entity
@Table(name = "brands")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String name;
    private String website;

}