package main.Java;

import main.Java.enums.GemsTitle;
import main.Java.enums.GemsType;
import main.Java.enums.TransparencyOfGems;
import main.Java.models.Gems;

import java.util.Arrays;
import java.util.List;


public class Runner {

    public static List<Gems> gems = Arrays.asList(
            new NewJewelery(GemsTitle.BRILLIANT, 2.0, GemsType.PRECIOUS, TransparencyOfGems.TRANSPARENT),
            new NewJewelery(GemsTitle.DIAMOND, 0.5, GemsType.SEMIPRECIOUS, TransparencyOfGems.SEMITRANSPARENT),
            new NewJewelery(GemsTitle.EMERALD, 1.5, GemsType.PRECIOUS, TransparencyOfGems.TRANSPARENT),
            new NewJewelery(GemsTitle.ZIRCONY, 3.2, GemsType.SEMIPRECIOUS, TransparencyOfGems.TRANSLUCENT),
            new NewJewelery(GemsTitle.OPAL, 0.2, GemsType.SEMIPRECIOUS, TransparencyOfGems.OPAQUE),
            new NewJewelery(GemsTitle.AGATE, 0.5, GemsType.SEMIPRECIOUS, TransparencyOfGems.OPAQUE),
            new NewJewelery(GemsTitle.SAPPHIRE, 8.0, GemsType.PRECIOUS, TransparencyOfGems.TRANSPARENT),
            new NewJewelery(GemsTitle.RUBY, 5.0, GemsType.PRECIOUS, TransparencyOfGems.SEMITRANSPARENT),
            new NewJewelery(GemsTitle.AMBER, 1.6, GemsType.SEMIPRECIOUS, TransparencyOfGems.TRANSLUCENT),
            new NewJewelery(GemsTitle.ONYX, 4.0, GemsType.SEMIPRECIOUS, TransparencyOfGems.SEMITRANSLUCENT),
            new NewJewelery(GemsTitle.TOPAZ, 4.0, GemsType.PRECIOUS, TransparencyOfGems.OPAQUE));


    public static void main(String[] args) {
        NewJewelery newJewelery = new NewJewelery(gems);
        newJewelery.selectGemsForJewelery(gems);
    }
}
