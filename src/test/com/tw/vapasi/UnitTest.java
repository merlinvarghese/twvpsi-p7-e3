package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest {
    @Test
    void expect20CMEquals20CM() {
        Unit unit = Unit.CM;
        double actualOutput = unit.convertToBase(20);
        assertEquals(20, actualOutput);
    }

    @Test
    void expect20MEquals2000CM() {
        Unit unit = Unit.M;
        double actualOutput = unit.convertToBase(20);
        assertEquals(2000, actualOutput);
    }

    @Test
    void expect20KMEquals200000CM() {
        Unit unit = Unit.KM;
        double actualOutput = unit.convertToBase(20);
        assertEquals(2000000, actualOutput);
    }
}
