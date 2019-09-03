package com.tw.vapasi;

import java.util.Objects;

//understands measurements
class Length {
    private final double magnitude;
    private final Unit unit;

    private Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    static Length cm(double magnitude) {
        return new Length(magnitude, Unit.CM);
    }

    static Length km(double magnitude) {
        return new Length(magnitude, Unit.KM);
    }

    static Length meter(double magnitude) {
        return new Length(magnitude, Unit.M);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length other = (Length) o;
        return convertToBaseUnit() == other.convertToBaseUnit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    private double convertToBaseUnit() {
        return unit.convertToBase(magnitude);
    }

}
