package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.net.URL;


@Entity
@Table(name = "brands")
public class Brand {

    @Id
    private static Integer ID= 1;
    private String name;
    private URL website;

    public Integer getID(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getWebsite() {
        return website;
    }

    public void setWebsite(URL website) {
        this.website = website;
    }

    public Brand() {
        ID++;
    }

    public Brand(String name, URL website) {
        this.name = name;
        this.website = website;
        ID++;
    }
}
