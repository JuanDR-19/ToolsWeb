package com.example.demo.Entities;

import jakarta.persistence.*;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;

@Entity
@Table(name = "tools")
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String name;
    private URL img;
    private String description;
    @ManyToOne
    private Brand brand;
    private double price;
    @ElementCollection
    private ArrayList<City> cities;
    private Integer quantity;

    public Integer getnextID(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getImg() {
        return img;
    }

    public void setImg(URL img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Tool() {
    }

    public Tool(String name, URL img, String description, Brand brand, double price, ArrayList<City> cities, Integer quantity) {
        this.name = name;
        this.img = img;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.cities = cities;
        this.quantity = quantity;
    }
}
