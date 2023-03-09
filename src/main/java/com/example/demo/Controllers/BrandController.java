package com.example.demo.Controllers;

import com.example.demo.Entities.Brand;
import com.example.demo.Entities.City;
import com.example.demo.Services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BrandController {

    @Autowired
    BrandService brands;
    @GetMapping(value="/all")
    public ArrayList<Brand> getAll(){
        return (ArrayList<Brand>) brands.SearchAll();
    }

    @PostMapping(value="/NewBrand")
    public void NewBrand(@RequestBody Brand brand){
        brands.InsertNewBrand(brand);
    }
}
