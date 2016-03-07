package com.soebes.maui.it;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vaingart on 06/03/2016.
 */
public class TestUnitExample {

    @Test
    public void successUnitTestA() {
        BitMask bm = new BitMask(1);
        bm.methodToPassUTestA();
        assertEquals(true, true);
    }

    @Test
    public void FailUnitTestA() {
        SubjectClass sc = new SubjectClass();
        sc.subjectMethodA();
        assertEquals(true, false);
    }
}
