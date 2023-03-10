package com.example.demo.Controllers;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import com.example.demo.Services.CityService;
import com.example.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {
    @Autowired
    CityService city;



    @GetMapping(value="/allcities", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<City> getAll(){
        return (ArrayList<City>) city.SearchAll();
    }


    @PostMapping(value="/NewCity")
    public void NewCity(@RequestBody City city1){
        city.InsertNewTool(city1);
    }

    @PutMapping(value="/updateCity/{id}")
    public void updateCity(@RequestBody String name,@PathVariable Integer id){
        //city.updateCity(name,id);
    }

    @DeleteMapping(value="/deleteCity/{ID}")
    public void deleteCity(@PathVariable Integer ID){
        city.deleteCity(ID);
    }

}
