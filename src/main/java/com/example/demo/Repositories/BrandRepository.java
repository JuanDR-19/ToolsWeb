package com.example.demo.Repositories;
import com.example.demo.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BrandRepository extends JpaRepository<Brand, Integer> {


}
