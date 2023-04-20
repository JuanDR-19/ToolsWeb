package com.example.demo.Services;

import com.example.demo.Entities.City;
import com.example.demo.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * clase de servicio de ciudad
 */
@Service
public class CityService {
    /**
     * Inyeccion de dependencia del repositorio de Ciudades
     */
    @Autowired
    CityRepository Repo;

    /**
     * metodo que busca todas las ciudades del sistema
     * @return ArrayList - de todas las ciudades del sistema
     */
    public ArrayList<City> SearchAll(){
        return (ArrayList<City>) Repo.findAll();
    }

    /**
     * metodo que inserta una nueva ciudad
     * @param c - ciudad a insertar
     */
    public void Put(City c){
        Repo.save(c);
    }

    /**
     * metodo que modifica la informacion de una ciudad
     * @param c - ciudad a modificar
     */
    public void updateCity(City c){
        Repo.save(c);
    }

    /**
     * metodo que elimina una ciudad
     * @param ID - identificador de la ciudad que se desea eliminar
     */
    public void deleteCity(Integer ID){
        Repo.deleteById(ID);
    }

    /**
     * metodo que busca una ciudad
     * @param ID - identificador la ciudad a buscar
     * @return City - ciudad encoontrada o null si no se encuentra en el sistema
     */
    public City findOne(Integer ID){
        if (Repo.existsById(ID)){
            return Repo.getReferenceById(ID);
        }
        return null;
    }
}
