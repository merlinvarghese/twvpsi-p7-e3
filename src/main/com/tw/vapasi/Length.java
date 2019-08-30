package com.tw.vapasi;

import java.util.Objects;

//understands measurements
class Length {
    private final static int MULTIPLIER_CM_METER = 100;
    private final static int MULTIPLIER_CM_KILOMETER = 100000;

    private final double magnitude;
    private final Unit unit;

    enum Unit {
        CM,
        METER,
        KM
    }

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
        return new Length(magnitude, Unit.METER);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length other = (Length) o;
        return convertToCentiMeter() == other.convertToCentiMeter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    private double convertToCentiMeter() {
        switch (unit) {
            case METER:
                return magnitude * MULTIPLIER_CM_METER;
            case KM:
                return magnitude * MULTIPLIER_CM_KILOMETER;
            default:
                return magnitude;
        }

    }

}
