package com.dmitry.lab1J2ee;

public class Motorbike {
    private long id;
    private String brand;
    private String model;
    private String color;
    private String fueltank;
    private String weight;

    public Motorbike(long id, String brand, String model, String color, String fueltank, String weight) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fueltank = fueltank;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getFueltank() {
        return fueltank;
    }

    public String getWeight() {
        return weight;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFueltank(String fueltank) {
        this.fueltank = fueltank;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "com.dmitry.lab1J2ee.Motorbike{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fueltank='" + fueltank + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
