package com.example.demo.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer city_id;
    private String name;

    @ManyToMany(mappedBy = "cities")
    @JsonIgnore
    private List<Tool> availability;
}
