package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthTest {
    @Test
    void expectHundredCmEqualToOneMeter() {
        Length hundredCm = new Length(100, "cm");
        Length oneMeter = new Length(1, "m");
        assertEquals(hundredCm, oneMeter);
    }

    @Test
    void expectTwoHundredCmNotEqualToOneMeter() {
        Length hundredCm = new Length(200, "cm");
        Length oneMeter = new Length(1, "m");
        assertNotEquals(hundredCm, oneMeter);
    }

    @Test
    void expectOneMeterEqualToHundredCm() {
        Length hundredCm = new Length(100, "cm");
        Length oneMeter = new Length(1, "m");
        assertEquals(oneMeter, hundredCm);
    }

    @Test
    void expectTwoMeterNotEqualToHundredCm() {
        Length hundredCm = new Length(100, "cm");
        Length twoMeter = new Length(2, "m");
        assertNotEquals(twoMeter, hundredCm);
    }

    @Test
    void expectOneThousandMeterEqualToOneKiloMeter() {
        Length thousandMeter = new Length(1000, "m");
        Length oneKiloMeter = new Length(1, "km");
        assertEquals(thousandMeter, oneKiloMeter);
    }

    @Test
    void expectOneThousandMeterNotEqualToTwoKiloMeter() {
        Length thousandMeter = new Length(1000, "m");
        Length twoKiloMeter = new Length(2, "km");
        assertNotEquals(thousandMeter, twoKiloMeter);
    }

    @Test
    void expectOneKiloMeterEqualToOneLakhCm() {
        Length oneLakhCm = new Length(100000, "cm");
        Length oneKiloMeter = new Length(1, "km");
        assertEquals(oneKiloMeter, oneLakhCm);
    }

}
