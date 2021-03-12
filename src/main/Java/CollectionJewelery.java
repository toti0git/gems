package main.Java;

import main.Java.models.Gem;
import main.Java.models.GemsType;
import main.Java.models.NameOfGems;

public class CollectionJewelery extends Gem {
    private double carats;
    private int amountOfGems;
    private GemsType gemsType;
    private int price;
    private NameOfGems nameOfGem;


    public CollectionJewelery(NameOfGems nameOfGem, double carats, int amountOfGems, GemsType type, int price) {
        this.carats = carats;
        this.amountOfGems =amountOfGems;
        this.gemsType = type;
        this.price = price;
        this.nameOfGem = nameOfGem;
    }
}
