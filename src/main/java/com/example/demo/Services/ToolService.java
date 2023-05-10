package com.example.demo.Services;
import com.example.demo.Entities.Tool;
import com.example.demo.Repositories.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


/**
 * Servicio para el manejo de herramientas
 */
@Service
public class ToolService {

    /**
     * Injeccion de dependencia del repositorio de herramientas
     */
    @Autowired
    ToolRepository Repo;

    /**
     * metodo que inserta una nueva herramienta
     * @param T - herramienta a insertar
     */
    public void InsertNewTool(Tool T){
        Repo.save(T);
    }

    /**
     * metodo que busca todas las herramientas del sistema
     * @return ArrayList - con todas las herramientas del sistema
     */
    public ArrayList<Tool> SearchAll(){
        return (ArrayList<Tool>) Repo.findAll();
    }

    public Page<Tool> toolsPages(Pageable pageable){
        return Repo.findAll(pageable);
    }

    /**
     * metodo que modifica la informacion de una herramienta
     * @param t - informacion para poner en la herramienta a modificar
     */
    public void updateTool(Tool t){
        Repo.save(t);
    }

    /**
     * metodo que permite eliminar una herramienta
     * @param ID - identificador de la herramienta que se desea eliminar
     */
    public void deleteTool(Integer ID){
        Repo.deleteById(ID);
    }

    /**
     * metodo que busca una herramienta por su id
     * @param ID - identificador de la herramienta que se desea buscar
     * @return Tool- con la herramienta encontrada o null si esta no existe
     */
    public Tool findOne(Integer ID){
        if(Repo.existsById(ID)){
            return Repo.getReferenceById(ID);
        }
        return null;
    }

}