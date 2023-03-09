package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class ToolController {
    @Autowired
    ArrayList<Tool> tools;

    @Autowired
    ArrayList<Brand> brands;

    @GetMapping(value="/all")
    public ArrayList<Tool> getAll(){
        return tools;
    }



    @PostMapping(value="/NewTool")
    public void NewTool(@RequestBody Tool tool){

    }


}
