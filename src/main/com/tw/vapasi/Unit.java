package com.tw.vapasi;

//understands standard of measuring length
class Unit {
    private static final double MULTIPLIER_CM_CM = 1;
    private static final double MULTIPLIER_CM_METER = 100;
    private static final double MULTIPLIER_CM_KILOMETER = 100000;
    static final Unit CM = new Unit(MULTIPLIER_CM_CM);
    static final Unit M = new Unit(MULTIPLIER_CM_METER);
    static final Unit KM = new Unit(MULTIPLIER_CM_KILOMETER);
    private double conversionFactor;

    private Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double convertToBase(double magnitude) {
        return magnitude * this.conversionFactor;
    }
}
