package com.example.demo.Controllers;
import com.example.demo.Entities.Brand;
import com.example.demo.Services.BrandService;
import com.example.demo.Entities.Tool;
import com.example.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ToolController {
    @Autowired
    ToolService tools;



    @GetMapping(value="/alltools")
    public ArrayList<Tool> getAll(){
        return tools.SearchAll();
    }



    @PostMapping(value="/NewTool")
    public void NewTool(@RequestBody Tool tool){
        tools.InsertNewTool(tool);
    }

    @PutMapping(value="/updatetool")
    public void updateTool(@RequestBody Tool tool){
        tools.updateTool(tool.getName(),tool.getImg(),tool.getDescription(),tool.getBrand(),tool.getPrice(),tool.getCities(),tool.getQuantity(), tool.getnextID());
    }


}
