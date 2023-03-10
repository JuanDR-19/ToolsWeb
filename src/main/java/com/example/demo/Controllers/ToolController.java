package com.example.demo.Controllers;
import com.example.demo.Entities.Brand;
import com.example.demo.Services.BrandService;
import com.example.demo.Entities.Tool;
import com.example.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class ToolController {
    @Autowired
    ToolService tools;



    @GetMapping(value="/alltools", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<Tool> getAll(){
        return tools.SearchAll();
    }



    @PostMapping(value="/NewTool")
    public void NewTool(@RequestBody Tool tool){
        tools.InsertNewTool(tool);
    }

    @PutMapping(value="/updatetool/{id}")
    public void updateTool(@RequestBody Tool tool,@PathVariable Integer id){
        tools.updateTool(tool.getName(),tool.getImg(),tool.getDescription(),tool.getBrand(),tool.getPrice(),tool.getCities(),tool.getQuantity(), id);
    }


}
