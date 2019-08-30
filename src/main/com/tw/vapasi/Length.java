package com.tw.vapasi;

import java.util.Objects;

//understands measurements
class Length {
    private static String CM = "cm";
    private static String METER = "m";
    private static int MULTIPLIER_CM_METER = 100;

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
        return ((unit.equals(CM) && other.unit.equals(METER))
            && value == other.value * MULTIPLIER_CM_METER);
  //s      return ((unit.equals(METER) && other.unit.equals(CM))
//                && other.value == value * MULTIPLIER_CM_METER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
