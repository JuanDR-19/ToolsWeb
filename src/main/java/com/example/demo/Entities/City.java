package com.example.demo.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * Clase City que representa una Ciudad en el programa
 */
@Entity
@Data
public class City implements Serializable {

    /**
     * Identificador de la ciudad
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer city_id;
    /**
     * Nombre de la ciudad
     */
    private String name;

    /**
     * Lista de las herramientas que estan en esta ciudad
     */
    @ManyToMany(mappedBy = "cities")
    @JsonIgnore
    private List<Tool> availability;
}
