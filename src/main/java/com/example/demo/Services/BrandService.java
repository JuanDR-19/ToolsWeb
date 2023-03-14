package com.example.demo.Services;

import com.example.demo.Repositories.BrandRepository;
import com.example.demo.Entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BrandService {

    @Autowired
    BrandRepository brand;

    public void InsertNewBrand(Brand B){
        brand.save(B);
    }

    public ArrayList<Brand> SearchAll(){
        return (ArrayList<com.example.demo.Entities.Brand>) brand.findAll();
    }

    public void deleteBrand(Integer ID) {
        brand.deleteById(ID);
    }
}
