package com.tw.vapasi;

//understands standard of measuring length
class Unit {


    private static final double MULTIPLIER_GM_GM = 1;
    private static final double MULTIPLIER_GM_KG = 1000;
    private static final double MULTIPLIER_CM_CM = 1;
    private static final double MULTIPLIER_CM_METER = 100;
    private static final double MULTIPLIER_CM_KILOMETER = 100000;
    public static final Unit KG = new Unit(MULTIPLIER_GM_KG);
    public static final Unit GM = new Unit(MULTIPLIER_GM_GM);
    static final Unit CM = new Unit(MULTIPLIER_CM_CM);
    static final Unit M = new Unit(MULTIPLIER_CM_METER);
    static final Unit KM = new Unit(MULTIPLIER_CM_KILOMETER);
    private static final String WEIGHT = "Weight";
    private static final String LENGTH = "Length";
    private double conversionFactor;



    private Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double convertToBase(double magnitude) {
        return magnitude * this.conversionFactor;
    }
}
