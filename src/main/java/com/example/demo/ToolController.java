package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class ToolController {
    @Autowired
    ToolService tools;

    @Autowired
    BrandService brands;

    @GetMapping(value="/all")
    public ArrayList<Tool> getAll(){
        return (ArrayList<Tool>) tools.getRepo().findAll();
    }



    @PostMapping(value="/NewTool")
    public void NewTool(@RequestBody Tool tool){
        tools.InsertNewTool(tool);
    }


}
