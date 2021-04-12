package main.Java.enums;

public enum GemsType {
    PRECIOUS(1),
    SEMIPRECIOUS(2);

    public final int gemsTypeValue;

    GemsType(int value) {
    gemsTypeValue=value;
    }
}
