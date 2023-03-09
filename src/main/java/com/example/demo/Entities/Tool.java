package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import javax.swing.*;
import java.util.ArrayList;

@Entity
@Table(name = "tools")
public class Tool {
    private static Integer ID = 1;
    private String name;
    private Icon img;
    private String description;
    @OneToOne
    private Brand brand;
    private double price;
    @OneToMany
    private ArrayList<String> cities;
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

    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
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

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Tool() {
        ID++;
    }

    public Tool(String name, Icon img, String description, Brand brand, double price, ArrayList<String> cities, Integer quantity) {
        this.name = name;
        this.img = img;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.cities = cities;
        this.quantity = quantity;
        ID++;
    }
}
