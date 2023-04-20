package com.example.demo.Controllers;

import com.example.demo.Entities.Brand;
import com.example.demo.Services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * clase controlador de marca
 */
@RestController
public class BrandController {

    /**
     * Injeccion de dependencia del servicio de brand
     */
    @Autowired
    BrandService brands;

    /**
     * metodo que trae todas las marcas del sistema
     * @return ArrayList - con todas las marcas del sistema
     */
    @GetMapping(value="/allbrands", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Brand> getAll(){
        return brands.SearchAll();
    }

    /**
     * metodo que modifica la informacion de una marca
     * @param u - informacion que se desea insertar a una marca
     * @param id - identificador de la herramienta a modificar
     * @return string - mensaje de exito o fallo al modificar
     */
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

    /**
     * metodo que inserta una nueva marca
     * @param brand - marca a insertar
     */
    @PostMapping(value="/NewBrand")
    public void NewBrand(@RequestBody Brand brand){
        brands.InsertNewBrand(brand);
    }

    /**
     * metodo que elimina una marca del sistema
     * @param ID - identificador de la marca a eliminar
     */
    @DeleteMapping(value="/deleteBrand/{ID}")
    public void deleteBrand(@PathVariable Integer ID){
        brands.deleteBrand(ID);
    }
}
