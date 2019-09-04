package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.tw.vapasi.Measurement.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MeasurementTest {
    @Test
    void expectHundredCmEqualToOneMeter() {
        assertEquals(cm(100), meter(1));
    }

    @Test
    void expectTwoHundredCmNotEqualToOneMeter() {
        assertNotEquals(cm(200), meter(1));
    }

    @Test
    void expectOneMeterEqualToHundredCm() {
        assertEquals(meter(1), cm(100));
    }

    @Test
    void expectTwoMeterNotEqualToHundredCm() {
        assertNotEquals(meter(2), cm(100));
    }

    @Test
    void expectOneThousandMeterEqualToOneKiloMeter() {
        assertEquals(meter(1000), km(1));
    }

    @Test
    void expectOneThousandMeterNotEqualToTwoKiloMeter() {
        assertNotEquals(meter(1000), km(2));
    }

    @Test
    void expectOneKiloMeterEqualToOneLakhCm() {
        assertEquals(km(1), cm(100000));
    }

    @Test
    void expectThousandMeterEqualToOneLakhCm() {
        assertEquals(meter(1000), cm(100000));
    }

    @Test
    void expectHundredCmNotEqualToThirtyCm() {
        assertNotEquals(cm(100), cm(30));
    }

    @Test
    void expectTwentyMeterNotEqualToHundredMeter() {
        assertNotEquals(meter(20), meter(100));
    }

    @Test
    void expectOneKilometerNotEqualToFortyKilometer() {
        assertNotEquals(km(1), km(40));
    }

    @Test
    void expect1KGequals1000GM() {
        assertEquals(kg(1), gm(1000));
    }

    @Test
    void expect1KGNotEquals1KM() {
        assertNotEquals(kg(10), km(1));
    }

    @Test
    void expect1KGNotEquals10M() {
        assertNotEquals(kg(1), meter(10));
    }

    @Test
    void expect300cmForAdditionOf100CMAnd200CM() throws IncompatibleMeasurementTypeException {
        Measurement cm100 = cm(100);
        assertEquals(cm(300), cm100.add(cm(200)));
    }

    @Test
    void expect2200GMAdditionOf2KGAnd200GM() {
        try {
            Measurement kg2 = kg(2);
            Measurement actualOutput = kg2.add(gm(200));
            assertEquals(kg(2.2), actualOutput);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    void expectFailOnAdditionOf2MAnd200GM() {
        try {
            Measurement m2 = meter(2);
            m2.add(gm(100));
            Assertions.fail("Incompatible types");
        } catch (Exception e) {
            //expected path
       }
    }
}
