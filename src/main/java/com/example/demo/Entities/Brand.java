package com.example.demo.Entities;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * Clase Brand que representa la marca las herramientas en el programa
 */
@Entity
@Data
public class  Brand implements Serializable {
    /**
     * Identificador de la marca
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer brand_id;
    /**
     * Nombre de la marca
     */
    private String name;
    /**
     * Url al sitio Web de la marca
     */
    private String website;
}