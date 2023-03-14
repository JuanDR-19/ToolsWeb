package com.example.demo.Entities;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;


@Entity
@Data
public class  Brand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brand_id;
    private String name;
    private String website;
}