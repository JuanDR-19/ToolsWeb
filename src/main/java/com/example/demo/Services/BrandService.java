package com.example.demo.Services;

import com.example.demo.Entities.Brand;
import com.example.demo.Repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BrandService {

    @Autowired
    BrandRepository Brand;

    public void InsertNewBrand(com.example.demo.Entities.Brand B){
        Brand.save(B);
    }

    public ArrayList<Brand> SearchAll(){
        return (ArrayList<com.example.demo.Entities.Brand>) Brand.findAll();
    }

    public void deleteBrand(Integer ID){
        Brand.deleteById(ID);
    }
}
