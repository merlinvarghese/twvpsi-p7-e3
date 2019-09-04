package com.tw.vapasi;

import java.util.Objects;

//understands amount of length and weight
class Measurement {
    private final double magnitude;
    private final Unit unit;


    Measurement add(Measurement other) throws IncompatibleMeasurementTypeException {
        if (this.unit.isNotOfSameType(other.unit)) {
            throw new IncompatibleMeasurementTypeException();
        }
        double totalInBase = this.convertToBaseUnit() + other.convertToBaseUnit();
        return new Measurement(convertToUnit(totalInBase), this.unit);
    }

    private double convertToUnit(double valueInBase) {
        return this.unit.convertFromBase(valueInBase);
    }

    private Measurement(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    static Measurement cm(double magnitude) {
        return new Measurement(magnitude, Unit.CM);
    }

    static Measurement km(double magnitude) {
        return new Measurement(magnitude, Unit.KM);
    }

    static Measurement meter(double magnitude) {
        return new Measurement(magnitude, Unit.M);
    }

    static Measurement kg(double magnitude) {
        return new Measurement(magnitude, Unit.KG);
    }

    static Measurement gm(double magnitude) {
        return new Measurement(magnitude, Unit.GM);
    }

    static Measurement celcius( double magnitude )
    {
        return new Measurement(magnitude,Unit.CELCIUS);
    }
    static Measurement kelvin( double magnitude )
    {
        return new Measurement(magnitude,Unit.KELVIN);
    }
    static Measurement fahrenheit( double magnitude )
    {
        return new Measurement(magnitude,Unit.FAHRENHEIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement other = (Measurement) o;
        if ( this.unit.isNotOfSameType( other.unit)) return false;
        return convertToBaseUnit() == other.convertToBaseUnit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit.hashCode());
    }

    private double convertToBaseUnit() {
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
