package com.tw.vapasi;

//understands standard of measuring length and weight
class Unit {
    private static final double MULTIPLIER_GM_GM = 1;
    private static final double MULTIPLIER_GM_KG = 1000;

    private static final double MULTIPLIER_CM_CM = 1;
    private static final double MULTIPLIER_CM_METER = 100;
    private static final double MULTIPLIER_CM_KILOMETER = 100000;

    private static final double MULTIPLIER_F_C = 0.55 ;
    private static final double MULTIPLIER_K_C = 1;
    private static final double MULTIPLIER_C_C = 1;

    static final Unit KG = new Unit(MULTIPLIER_GM_KG,TYPE.WEIGHT,0);
    static final Unit GM = new Unit(MULTIPLIER_GM_GM,TYPE.WEIGHT,0);

    static final Unit CM = new Unit(MULTIPLIER_CM_CM,TYPE.LENGTH,0);
    static final Unit M = new Unit(MULTIPLIER_CM_METER,TYPE.LENGTH,0);
    static final Unit KM = new Unit(MULTIPLIER_CM_KILOMETER,TYPE.LENGTH,0);

    static final Unit CELCIUS = new Unit(MULTIPLIER_C_C,TYPE.TEMPERATURE,0);
    static final Unit KELVIN = new Unit(MULTIPLIER_K_C,TYPE.TEMPERATURE,-273);
    static final Unit FAHRENHEIT = new Unit(MULTIPLIER_F_C,TYPE.TEMPERATURE,-17.77);


    private final double conversionFactor;

    private final TYPE type;

    enum TYPE {
        WEIGHT,
        LENGTH,
        TEMPERATURE
    }

    private final double offset;

    private Unit(double conversionFactor,TYPE type,double offset) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.offset = offset;
    }

    double convertToBase(double magnitude) {
        return (magnitude * this.conversionFactor) + this.offset;
    }

    double convertFromBase(double magnitude) {
        return (magnitude / this.conversionFactor) - this.offset;
    }

    boolean isNotOfSameType(Unit other) {
        return !this.type.equals(other.type);
    }
}
