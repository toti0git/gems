package main.Java;

import main.Java.enums.GemsType;
import main.Java.enums.NameOfGems;
import main.Java.models.Gem;

import java.util.Arrays;
import java.util.List;

public  class Runner {


   public static List<Gem> gems = Arrays.asList(new CollectionJewelery(NameOfGems.BRILLIANT, 5.0, GemsType.PRECIOUS, 12000),
            new CollectionJewelery(NameOfGems.DIAMOND, 3, GemsType.SEMIPRECIOUS, 34000),
            new CollectionJewelery(NameOfGems.EMERALD, 3,  GemsType.PRECIOUS, 12000),
            new CollectionJewelery(NameOfGems.TOPAZ, 5, GemsType.PRECIOUS, 54000));




    public static void main(String[] args) {

        CollectionJewelery collectionJewelery = new CollectionJewelery(gems);
        collectionJewelery.caratWeight(gems);
        collectionJewelery.sortingJewelery(gems);

    }

}
