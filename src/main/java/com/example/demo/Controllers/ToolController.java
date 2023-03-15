package com.example.demo.Controllers;
import com.example.demo.Entities.City;
import com.example.demo.Entities.Tool;
import com.example.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ToolController {
    @Autowired
    ToolService tools;

    @GetMapping(value="/get_tools", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Tool> getAll(){
        return tools.SearchAll();
    }

    @PostMapping(value="/NewTool")
    public void NewTool(@RequestBody Tool tool){
        tools.InsertNewTool(tool);
    }

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
            return "Esa herramienta no existe";
        }
    }

    @DeleteMapping(value="/deleteTool/{ID}")
    public void deleteTool(@PathVariable Integer ID){
        tools.deleteTool(ID);
    }


}
