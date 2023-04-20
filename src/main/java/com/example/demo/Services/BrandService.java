package com.example.demo.Services;

import com.example.demo.Repositories.BrandRepository;
import com.example.demo.Entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * clase que representa el servicio de marca
 */
@Service
public class BrandService {

    /**
     * Inyeccion de dependencia de repositorio de marca
     */
    @Autowired
    BrandRepository brand;

    /**
     * metodo que inserta una nueva marca
     * @param B - marca a insertar
     */
    public void InsertNewBrand(Brand B){
        brand.save(B);
    }

    /**
     * metodo que modifica la informacion de una marca
     * @param b - marca ya modificada
     */
    public void UpdateBrand(Brand b){
        brand.save(b);
    }

    /**
     * metodo que busca todas las marcas
     * @return ArrayList - con todas las marcas del sistema
     */
    public ArrayList<Brand> SearchAll(){
        return (ArrayList<com.example.demo.Entities.Brand>) brand.findAll();
    }

    /**
     * metodo que elimina una marca
     * @param ID - identificador de la marca a eliminar
     */
    public void deleteBrand(Integer ID) {
        brand.deleteById(ID);
    }

    /**
     * metodo que busca una marca
     * @param ID - identificador de la marca a buscar
     * @return brand - marca encontrada o null si no existe
     */
    public Brand findOne(Integer ID){
        if (brand.existsById(ID)){
            return brand.getReferenceById(ID);
        }else{
            return null;
        }
    }
}
