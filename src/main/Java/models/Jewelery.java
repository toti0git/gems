package main.Java.models;

import java.util.List;

public class Jewelery {
    private List <? extends Gem> gems;

    public Jewelery(List<? extends Gem> gems) {
        this.gems = gems;
    }


}
