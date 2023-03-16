package com.example.demo.Entities;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Data
public class  Brand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer brand_id;
    private String name;
    private String website;
}