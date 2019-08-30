package com.tw.vapasi;

import java.util.Objects;

//understands measurements
class Length {
    private final static String CM = "cm";
    private final static String METER = "m";
    private final static String KILOMETER = "km";
    private final static int MULTIPLIER_CM_METER = 100;
    private final static int MULTIPLIER_CM_KILOMETER = 100000;

    private int value;
    private String unit;

    Length(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length other = (Length) o;

        return compare(other);
    }

    boolean compare(Length other) {
        convertToCentiMeter(this);
        convertToCentiMeter(other);
        return (this.value == other.value);
    }

    // Converts all length objects to corresponding cm object
    Length convertToCentiMeter(Length length) {
        if (length.unit == CM) {
            return length;
        }
        if (length.unit == METER) {
            length.value = length.value * MULTIPLIER_CM_METER;
            length.unit = CM;
        }
        if (length.unit == KILOMETER) {
            length.value = length.value * MULTIPLIER_CM_KILOMETER;
            length.unit = CM;
        }
        return length;
    }


    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
