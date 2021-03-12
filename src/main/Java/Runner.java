package main.Java;

import main.Java.models.Gem;
import main.Java.models.GemsType;
import main.Java.models.Jewelery;
import main.Java.models.NameOfGems;

import java.util.Arrays;
import java.util.List;

public class Runner {
    List<Gem> gems = Arrays.asList(new CollectionJewelery(NameOfGems.BRILLIANT, 5, 5, GemsType.PRECIOUS, 12000),
            new CollectionJewelery(NameOfGems.DIAMOND, 3, 2, GemsType.SEMIPRECIOUS, 34000),
            new CollectionJewelery(NameOfGems.EMERALD, 3, 3, GemsType.PRECIOUS, 12000),
            new CollectionJewelery(NameOfGems.TOPAZ, 5, 3, GemsType.PRECIOUS, 54000));


    public void main(String[] args) {
        Jewelery jewelery = new Jewelery(gems);

    }

}
