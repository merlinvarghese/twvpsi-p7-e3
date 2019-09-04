package com.tw.vapasi;

import java.util.Objects;

//understands amount of length and weight
class Measurement {
    final double magnitude;
    final Unit unit;

    double convertToUnit(double valueInBase) {
        return this.unit.convertFromBase(valueInBase);
    }

    Measurement(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    static Measurement celcius(double magnitude) {
        return new Measurement(magnitude, Unit.CELSIUS);
    }

    static Measurement kelvin(double magnitude) {
        return new Measurement(magnitude, Unit.KELVIN);
    }

    static Measurement fahrenheit(double magnitude) {
        return new Measurement(magnitude, Unit.FAHRENHEIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement other = (Measurement) o;
        if (this.unit.isNotOfSameType(other.unit)) return false;
        return convertToBaseUnit() == other.convertToBaseUnit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    double convertToBaseUnit() {
        return unit.convertToBase(magnitude);
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "magnitude=" + magnitude +
                ", unit=" + unit +
                '}';
    }
}
