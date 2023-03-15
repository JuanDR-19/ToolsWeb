package com.example.demo.Repositories;

import com.example.demo.Entities.Brand;
import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface ToolRepository extends JpaRepository<Tool, Integer> {

}
