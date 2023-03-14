package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tool_city {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Tool tool_id;

    @ManyToOne
    private City city_id;
}
