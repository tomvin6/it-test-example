package com.soebes.maui.it;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by vaingart on 06/03/2016.
 */
public class AnotherUITest {
    
    @Test
    public void checkFirstBitTest() {
        BitMask bm = new BitMask(0x8000000000000000L);
        assertEquals(true, bm.isBitSet(63));
    }

    @Test
    public void checkNumberBitTest() {
        for (int bitNumber = 0; bitNumber < 32; bitNumber++) {
            long bitMask = Long.rotateLeft(1, bitNumber);
            BitMask bm = new BitMask(bitMask);
            assertEquals(true, bm.isBitSet(bitNumber));
        }
    }
}
