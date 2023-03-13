package com.example.demo.Entities;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cities")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String name;
}
