package main.Java;

import com.sun.tools.javac.Main;
import main.Java.enums.GemsTitle;
import main.Java.enums.GemsType;
import main.Java.enums.TransparencyOfGems;
import main.Java.models.Gems;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class NewJewelery extends Gems {
    private double weightInCarat;
    private double weight;
    private List<Gems> gemsList;
    private List<Gems> neckLace = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public NewJewelery(List<Gems> gemsList) {
        this.gemsList = gemsList;
    }

    public NewJewelery(GemsTitle name, double weight, GemsType type, TransparencyOfGems transparency) {
        super(name, weight, type, transparency);
    }

    //SELECT gems FOR NECKLACE. Select all gems except OPAL.
    public void selectGemsForJewelery(List<Gems> gemsList) {
        int maxNecklaceSize = 6;
        for (Gems gem : gemsList) {
            if (!gem.getName().toString().equals("OPAL") && neckLace.size() <= maxNecklaceSize) {
                neckLace.add(gem);
            }
        }
        calculateWeightInCarat(neckLace);
        sortingGemsOfNecklace(neckLace);
        getGemsByTransparency(2, 5, neckLace);
    }

    //Counting the total carat weight
    public void calculateWeightInCarat(List<Gems> gemsSet) {

        if (!gemsSet.isEmpty()) {
            try {
                for (int i = 0; i < gemsSet.size(); i++) {
                    weight += gemsSet.get(i).getWeight();
                }
                weightInCarat = weight / 0.2;
            } catch (ArrayIndexOutOfBoundsException arrıx) {
                logger.info("Index out of found! ");
            }
            logger.info("OVERALL CARATS: " + Math.ceil(weightInCarat));
        }
    }

    //SORTING GEMS OF A NECKLACE BASED ON VALUES
    public void sortingGemsOfNecklace(List<Gems> gems) {
        int length = gems.size();
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                try {
                    if (getGemsTypeValue(i, gems) > getGemsTypeValue(j, gems)) {
                        Collections.swap(gems, i, j);
                    }
                } catch (NullPointerException ex) {
                    logger.info("Null pointer exception");
                } catch (IndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    logger.info("Array index out of bound exception");
                }
            }
        }
        logger.info("Gems of necklace are sorted!");
    }

    public int getGemsTypeValue(int i, List<Gems> gemsList) {
        int value = (Integer.valueOf(gemsList.get(i).getType().gemsTypeValue));
        return value;
    }

    //Find stones in the necklace that match the given range of transparency parameters.
    public void getGemsByTransparency(int rangeFrom, int rangeTo, List<Gems> gemsList) {
        for (Gems gem : gemsList) {
            ValueRange range = ValueRange.of(rangeFrom, rangeTo);
            long transparencyValue = Long.parseLong(String.valueOf(TransparencyOfGems.valueOf(gem.getTransparency().name()).transparencyValue));
            if (range.isValidValue(transparencyValue)) {
                logger.info("TITLE OF GEM: " + gem.getName() + "TRANSPARENCY = " + TransparencyOfGems.getEnumByValue((int) transparencyValue));
            }
        }
    }


}
