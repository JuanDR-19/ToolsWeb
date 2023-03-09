package com.example.demo.Services;

import com.example.demo.Entities.Tool;
import com.example.demo.Repositories.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToolService {
    @Autowired
    ToolRepository Repo;

    public ToolRepository getRepo() {
        return Repo;
    }

    public void setRepo(ToolRepository repo) {
        Repo = repo;
    }

    public void InsertNewTool(Tool T){
        Repo.save(T);
    }

    public ArrayList<Tool> SearchAll(){
        return (ArrayList<Tool>) Repo.findAll();
    }

}
