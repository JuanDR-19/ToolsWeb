package com.example.demo.Entities;

import javax.persistence.*;

import java.net.URL;


@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
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
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Brand(String name, URL website) {
        this.name = name;
        this.website = website;
    }
}