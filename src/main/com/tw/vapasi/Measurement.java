package com.tw.vapasi;

import java.util.Objects;

//understands amount of length and weight
class Measurement {
    private final double magnitude;
    private final Unit unit;
    private final TYPE type;
    enum TYPE {
        WEIGHT,
        LENGTH
    }
    private Measurement(double magnitude, Unit unit, TYPE type) {
        this.magnitude = magnitude;
        this.unit = unit;
        this.type = type;
    }

    static Measurement cm(double magnitude) {
        return new Measurement(magnitude, Unit.CM,TYPE.LENGTH);
    }

    static Measurement km(double magnitude) {
        return new Measurement(magnitude, Unit.KM, TYPE.LENGTH);
    }

    static Measurement meter(double magnitude) {
        return new Measurement(magnitude, Unit.M, TYPE.LENGTH);
    }

    static Measurement kg(double magnitude) {
        return new Measurement(magnitude, Unit.KG, TYPE.WEIGHT);
    }

    static Measurement gm(double magnitude) {
        return new Measurement(magnitude, Unit.GM, TYPE.WEIGHT);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement other = (Measurement) o;
        if( !isSameType(other)) return false;
        return convertToBaseUnit() == other.convertToBaseUnit();
    }

    private boolean isSameType(Measurement other) {
        return this.type.equals( other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    private double convertToBaseUnit() {
        return unit.convertToBase(magnitude);
    }

}
