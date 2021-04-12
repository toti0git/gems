package main.Java;

import main.Java.models.Gem;
import main.Java.enums.GemsType;
import main.Java.enums.NameOfGems;

import java.util.Collections;
import java.util.List;

public class CollectionJewelery extends Gem {
    private double carats;
    private List<Gem> gemList;

    public CollectionJewelery(NameOfGems name, double carats, GemsType types, int price) {
        super(name, carats, types, price);

    }

    public CollectionJewelery(List<Gem> gemList) {

        this.gemList = gemList;
    }

    // СЧИТЬАЕМ ОБЩИЙ ВЕС В КАРАТАХ
    public void caratWeight(List<Gem> gemsSet) {
        if (!gemsSet.isEmpty()) {
            try {
                for (int i = 0; i <= gemsSet.size(); i++) {
                    carats += gemsSet.get(i).getCarats();


                }
            } catch (ArrayIndexOutOfBoundsException arex) {
                System.out.println("INDEX is out");
            }

            System.out.println("The caratrs of jewelery " + carats);
        }
    }


    //СОРТИРОВКА КАМНЕЙ НА ОСНОВЕ ЦЕННОСТЕЙ
    public void sortingJewelery(List<Gem> gems) {
        // Gem tempGem;
        for (int i = 0; i < gems.size(); i++) {
            try {
                if ((gems.get(i).getTypes().equals(GemsType.PRECIOUS)) && (gems.get(i + 1) != null)) {
                    System.out.println("ok");
                } else {
                    Collections.swap(gems, i, i + 1);
                }
            } catch (NullPointerException ex) {
                System.out.println("Null pointer found");
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("Array is sorted");
            }


        }
    }


}
