package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
