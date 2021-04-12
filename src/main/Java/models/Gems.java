package main.Java.models;

import main.Java.enums.GemsType;
import main.Java.enums.GemsTitle;
import main.Java.enums.TransparencyOfGems;

public abstract class Gems {
    private GemsTitle name;
    private double weight;
    private GemsType type;
    private TransparencyOfGems transparency;


    public Gems(GemsTitle name, double weight, GemsType type,  TransparencyOfGems transparency) {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.transparency = transparency;
    }

    protected Gems() {
    }

    public void setName(GemsTitle name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setType(GemsType type) {
        this.type = type;
    }

    public void setTransparency(TransparencyOfGems transparency) {
        this.transparency = transparency;
    }

    public GemsTitle getName() {
        return name;
    }

    public GemsType getType() {
        return type;
    }

    public TransparencyOfGems getTransparency() {
        return transparency;
    }
}
