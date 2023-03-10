package com.example.demo.Controllers;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import com.example.demo.Services.CityService;
import com.example.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {
    @Autowired
    CityService city;



    @GetMapping(value="/allcities")
    public ArrayList<City> getAll(){
        return (ArrayList<City>) city.SearchAll();
    }


    @PostMapping(value="/NewCity")
    public void NewCity(@RequestBody City city1){
        city.InsertNewTool(city1);
    }

    @PutMapping(value="/updateCity")
    public void updateCity(@RequestBody String name){
        city.updateCity(name);
    }

}
