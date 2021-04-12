package main.Java.enums;

public enum TransparencyOfGems {
    TRANSPARENT(5),
    SEMITRANSPARENT(4),
    TRANSLUCENT(3),
    SEMITRANSLUCENT(2),
    OPAQUE(1);

    public final int transparencyValue;

    TransparencyOfGems(int transparencyValue) {
        this.transparencyValue = transparencyValue;
    }

    public static String getEnumByValue(int code) {
        for (TransparencyOfGems e : TransparencyOfGems.values()) {
            if (e.transparencyValue == code) return e.name();
        }
        return null;
    }
}
