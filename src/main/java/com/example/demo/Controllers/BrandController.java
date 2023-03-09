package com.example.demo.Controllers;

import com.example.demo.Entities.Brand;
import com.example.demo.Services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BrandController {

    @Autowired
    BrandService brands;

    @PostMapping(value="/NewBrand")
    public void NewBrand(@RequestBody Brand brand){
        brands.InsertNewBrand(brand);
    }
}
