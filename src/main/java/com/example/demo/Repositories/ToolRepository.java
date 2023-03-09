package com.example.demo.Repositories;

import com.example.demo.Entities.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;


public interface ToolRepository extends JpaRepository<Tool, Integer> {


}
