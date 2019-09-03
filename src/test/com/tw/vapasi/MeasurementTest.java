package com.tw.vapasi;

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

}