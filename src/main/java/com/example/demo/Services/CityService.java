package com.example.demo.Services;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import com.example.demo.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CityService {
    @Autowired
    CityRepository Repo;

    public void InsertNewTool(City c){
        Repo.save(c);
    }

    public ArrayList<City> SearchAll(){
        return (ArrayList<City>) Repo.findAll();
    }

    public void Put(City c){

    }
}