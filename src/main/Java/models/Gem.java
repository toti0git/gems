package main.Java.models;

import main.Java.enums.GemsType;
import main.Java.enums.NameOfGems;

public abstract class Gem {
    private NameOfGems name;
     double carats;
    private GemsType types;
    private int price;
    private String color;

    public Gem(NameOfGems name, double carats, GemsType types, int price) {
        this.name = name;
        this.carats = carats;
        this.types = types;
        this.price = price;

    }

    protected Gem() {
    }


    public void setName(NameOfGems name) {
        this.name = name;
    }

    public void setCarats(double carats) {
        this.carats = carats;
    }

    public void setTypes(GemsType types) {
        this.types = types;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NameOfGems getName() {
        return name;
    }

    public double getCarats() {
        return carats;
    }

    public GemsType getTypes() {
        return types;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
