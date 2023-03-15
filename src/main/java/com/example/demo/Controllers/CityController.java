package com.example.demo.Controllers;

import com.example.demo.Entities.City;
import com.example.demo.Services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {
    @Autowired
    CityService city;

    @GetMapping(value="/allcities", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<City> getAll(){
        return city.SearchAll();
    }


    @PostMapping(value="/NewCity")
    public void NewCity(@RequestBody City city1){
        city.Put(city1);
    }

    @PutMapping(value="/updateCity/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String updateCity(@RequestBody City c,@PathVariable Integer id){
        City x = city.findOne(id);
        if (x!=null){
            x.setName(c.getName());
            x.setAvailability(c.getAvailability());
            city.updateCity(x);
            return "Exito";
        }else{
            return "Esta ciudad no existe";
        }

    }

    @DeleteMapping(value="/deleteCity/{ID}")
    public void deleteCity(@PathVariable Integer ID){
        city.deleteCity(ID);
    }

}
