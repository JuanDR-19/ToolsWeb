package com.example.demo;

import java.net.URL;

public class Brand {
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
