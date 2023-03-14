package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Tool_city {
    @ManyToOne
    private Tool tool_id;

    @ManyToOne
    private City city_id;
}
