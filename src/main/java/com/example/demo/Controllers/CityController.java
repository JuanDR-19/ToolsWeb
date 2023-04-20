package com.example.demo.Controllers;

import com.example.demo.Entities.City;
import com.example.demo.Services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Clase de controlador de ciudades
 */
@RestController
public class CityController {
    /**
     * Injeccion de dependencia del servicio de ciudad
     */
    @Autowired
    CityService city;

    /**
     * metodo que trae todas las ciudades en el sistema
     * @return ArrayList - lista de ciudades en el sistema
     */
    @GetMapping(value="/allcities", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<City> getAll(){
        return city.SearchAll();
    }

    /**
     * metodo que crea una nueva ciudad
     * @param city1 - ciudad a crear
     */
    @PostMapping(value="/NewCity")
    public void NewCity(@RequestBody City city1){
        city.Put(city1);
    }

    /**
     * metodo para modificar la informacion de una ciudad
     * @param c - informacion a insertar en la ciudad deseada
     * @param id - identificador unico de la herramienta a modificar
     * @return string - mensaje de exito o fallo modificando a la ciudad
     */
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

    /**
     * metodo que elimina una herramienta
     * @param ID - identificador de la herramienta que se desea eliminar
     */
    @DeleteMapping(value="/deleteCity/{ID}")
    public void deleteCity(@PathVariable Integer ID){
        city.deleteCity(ID);
    }

}
