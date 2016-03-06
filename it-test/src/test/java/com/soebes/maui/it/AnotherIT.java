package com.soebes.maui.it;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AnotherIT {

    @Test
    public void checkFirstBitTest() {
        BitMask bm = new BitMask(0x8000000000000000L);
        assertEquals(true, bm.isBitSet(63));
    }

    @Test
    public void methodForITestA() {
        BitMask bm = new BitMask(0x8000000000000000L);
        bm.methodToPass();
    }

}
