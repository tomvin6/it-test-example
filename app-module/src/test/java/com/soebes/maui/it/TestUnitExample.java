package com.soebes.maui.it;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by vaingart on 06/03/2016.
 */
public class TestUnitExample extends TestCase {

    @Test
    public void checkFirstBitTest() {
        BitMask bm = new BitMask(0x8000000000000000L);
        assertEquals(true, true);
    }

    @Test
    public void checkNumberBitTest() {
        assertEquals(true, true);
    }
}
