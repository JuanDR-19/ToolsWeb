package com.example.demo.Repositories;

import com.example.demo.Entities.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Calse que representa la herramienta en como imagen de un JpaRepository
 * ver {@link org.springframework.data.jpa.repository.JpaRepository}
 */
public interface ToolRepository extends JpaRepository<Tool, Integer> {

}
