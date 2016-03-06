package com.soebes.maui.it;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
/**
 * Created by vaingart on 06/03/2016.
 */
public class TestUnitExample {

    @Test
    public void successTestC() {
        BitMask bm = new BitMask(0x8000000000000000L);
        assertEquals(true, true);
    }

    @Test
    public void successTestB() {
        assertEquals(true, true);
    }

    @Test
    public void successTestA() {
        assertEquals(true, true);
    }
}
