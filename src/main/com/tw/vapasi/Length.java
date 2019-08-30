package com.tw.vapasi;

import java.util.Objects;

//understands measurements
class Length {
    private final static String CM = "cm";
    private final static String METER = "m";
    private final static String KILOMETER = "km";
    private final static int MULTIPLIER_CM_METER = 100;
    private final static int MULTIPLIER_CM_KILOMETER = 100000;

    private final int value;
    private final String unit;

    Length(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    private boolean compareTo(Length other) {
        Length newLengthThis = convertToCentiMeter(this);
        Length newLengthOther = convertToCentiMeter(other);
        return (newLengthThis.value == newLengthOther.value);
    }

    // Converts all length objects to corresponding cm object
    private Length convertToCentiMeter(Length length) {
        Length convertedLength;
        int value = 0;
        String unit = null;
        if (length.unit.equals(CM)) return length;
        if (length.unit.equals(METER)) {
            value = length.value * MULTIPLIER_CM_METER;
            unit = CM;
        }
        if (length.unit.equals(KILOMETER)) {
            value = length.value * MULTIPLIER_CM_KILOMETER;
            unit = CM;
        }
        convertedLength = new Length(value, unit);
        return convertedLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length other = (Length) o;
        return compareTo(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
