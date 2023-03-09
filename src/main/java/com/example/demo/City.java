package com.example.demo;

public class City {

    private static Integer ID = 1;
    private String name;

    public static Integer getID() {
        return ID;
    }

    public static void setID(Integer ID) {
        City.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City() {
    }

    public City(String name) {
        this.name = name;
    }
}
