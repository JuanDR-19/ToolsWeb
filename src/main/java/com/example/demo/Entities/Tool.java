package com.example.demo.Entities;
import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Clase Tool que representa una herramienta en el programa
 */
@Entity
@Data
public class Tool implements Serializable {
    /**
     El ID del producto.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     El nombre de la herramienta.
     */
    private String name;
    /**
     La url a la imagen de la herramienta.
     */
    private String img;

    /**
     La descripción de la herramienta.
     */
    private String description;

    /**
     El identificador que hace referencia a la marca de la herramienta en otra tabla distinta
     */
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand_id;

    /**
     * El precio de la herramienta
     */
    private double price;

    /**
     * la lista de ciudades en donde se encuentra la herramienta
     */
    @ManyToMany
    private List<City> cities;

    /**
     * Cantidad de esta herramienta que existe en inventario
     */
    private Integer quantity;

}
