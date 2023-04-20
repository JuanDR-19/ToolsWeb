package com.example.demo.Repositories;
import com.example.demo.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Calse que representa la marca en como imagen de un JpaRepository
 * ver {@link org.springframework.data.jpa.repository.JpaRepository}
 */
public interface BrandRepository extends JpaRepository<Brand, Integer> {


}
