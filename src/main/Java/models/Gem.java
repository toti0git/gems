package main.Java.models;

public class Gem {
    private String name;
    private double carats;
    private  GemsType types;
    private int price;
    private String color;

    public void setName(String name) {
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

    public String getName() {
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
