package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthTest {
    @Test
    void expectHundredCmEqualToOneMeter(){
        Length hundredCm = new Length(100, "cm");
        Length oneMeter = new Length(1, "m");
        assertEquals(hundredCm, oneMeter);
    }

    @Test
    void expectTwoHundredCmNotEqualToOneMeter(){
        Length hundredCm = new Length(200, "cm");
        Length oneMeter = new Length(1, "m");
        assertNotEquals(hundredCm, oneMeter);
    }

/*    @Test
    void expectOneMeterEqualToHundredCm(){
        Length hundredCm = new Length(100, "cm");
        Length oneMeter = new Length(1, "m");
        assertEquals(oneMeter, hundredCm);
    }*/

}
