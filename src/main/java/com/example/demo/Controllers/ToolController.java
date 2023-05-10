package com.example.demo.Controllers;

import com.example.demo.Entities.Tool;
import com.example.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Clase que controla los servicios del servicio de herramientas
 */
@RestController
public class ToolController {
    /**
     * Injeccion de dependencia del servicio de herramientas
     */
    @Autowired
    ToolService tools;

    /**
     * metodo que muestra la lista de herramientas
     * @return Tool[] con todas las herramientas del sistema
     */
    @GetMapping(value="/get_tools", produces = {MediaType.APPLICATION_JSON_VALUE})
    @CrossOrigin(origins = "http://localhost:4200")
    public ArrayList<Tool> getAll(){
        return tools.SearchAll();
    }

    @GetMapping(value="/get_tools_paginated")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Page<Tool>> pages(
            @RequestParam(defaultValue = "0") int page,//numero de pagina que se quiere traer al front
            @RequestParam(defaultValue = "6") int size,//tamaño de las paginas
            @RequestParam(defaultValue = "id") String order, //orden
            @RequestParam(defaultValue = "true") boolean asc//orden ascendente
    ) {
        Page<Tool> toolspages = tools.toolsPages(PageRequest.of(page, size, Sort.by(order)));
        if(!asc){
            toolspages = tools.toolsPages(PageRequest.of(page, size, Sort.by(order).descending()));
        }
        return new ResponseEntity<Page<Tool>>(toolspages, HttpStatus.OK) ;
    }

    /**
     * metodo que inserta una nueva herramienta
     * @param tool - Herramienta a insertar en el sistema
     */
    @PostMapping(value="/NewTool")
    public void NewTool(@RequestBody Tool tool){
        tools.InsertNewTool(tool);
    }

    /**
     * metodo que actualiza una herramienta
     * @param tool - informacion de la herramienta
     * @param id - identificador de la herramienta a modificar
     * @return string - mensaje de exito del metodo o de insertar una nueva herramienta
     */
    @PutMapping(value="/updatetool/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public String updateTool(@RequestBody Tool tool,@PathVariable Integer id){
        Tool x = tools.findOne(id);

        if (x!=null){
            x.setName(tool.getName());
            x.setImg(tool.getImg());
            x.setCities(tool.getCities());
            x.setBrand_id(tool.getBrand_id());
            x.setDescription(tool.getDescription());
            x.setPrice(tool.getPrice());
            x.setQuantity(tool.getQuantity());

            tools.updateTool(x);
            return "Fue un exito";
        }else{
            tools.InsertNewTool(tool);
            return "Herramienta agregada";
        }
    }

    /**
     * metodo que elimina una herramienta
     * @param ID - identificador de la herramienta a eliminar
     */
    @DeleteMapping(value="/deleteTool/{ID}")
    public void deleteTool(@PathVariable Integer ID){
        tools.deleteTool(ID);
    }


}