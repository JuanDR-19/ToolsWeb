package com.example.demo.Controllers;

import com.example.demo.Entities.Brand;
import com.example.demo.Services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BrandController {

    @Autowired
    BrandService brands;
    @GetMapping(value="/allbrands", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Brand> getAll(){
        return brands.SearchAll();
    }

    @PutMapping(value="/Updatebrand/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String UpdateBrand(@RequestBody Brand u,@PathVariable Integer id){
        Brand x = brands.findOne(id);
        if(x!=null){
            x.setName(u.getName());
            x.setWebsite(u.getWebsite());
            brands.UpdateBrand(x);
            return "exito";
        }
        return "Esa marca no existe";
    }

    @PostMapping(value="/NewBrand")
    public void NewBrand(@RequestBody Brand brand){
        brands.InsertNewBrand(brand);
    }

    @DeleteMapping(value="/deleteBrand/{ID}")
    public void deleteBrand(@PathVariable Integer ID){
        brands.deleteBrand(ID);
    }
}
