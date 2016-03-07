package com.soebes.maui.it;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BitMaskIT {

    @Test
    public void checkFirstBitTest() {
        BitMask bm = new BitMask(0x8000000000000000L);
        assertEquals(true, bm.isBitSet(63));
    }

    @Test
    public void adhocBitTest() {
        BitMask bm = new BitMask(0xffffffffffffffffL);
//        System.out.println("Value: "
//                + Long.toBinaryString(bm.getBitMaskValue()));
        bm.unsetBit(10);
        bm.unsetBit(20);
        bm.unsetBit(30);
        bm.unsetBit(40);
        bm.unsetBit(50);
        bm.unsetBit(60);
//        System.out.println("Value: "
//                + Long.toBinaryString(bm.getBitMaskValue()));
        assertEquals(false, bm.isBitSet(10));
        assertEquals(false, bm.isBitSet(20));
        assertEquals(false, bm.isBitSet(30));
        assertEquals(false, bm.isBitSet(40));
        assertEquals(false, bm.isBitSet(50));
        assertEquals(false, bm.isBitSet(60));
    }
}
