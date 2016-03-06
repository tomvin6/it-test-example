package com.soebes.maui.it;



/**
 * Maven Unit Integration Test Guide
 *
 * @author Karl Heinz Marbaise
 *
 */
public class BitMask {

    private long bitMaskValue;

    public long getBitMaskValue() {
        return bitMaskValue;
    }

    public BitMask() {
        bitMaskValue = 0;
    }

    public BitMask(long currentValue) {
        this.bitMaskValue = currentValue;
    }

    public void setBit(int bit) {
        long bitMask = Long.rotateLeft(1, bit);
        bitMaskValue |= bitMask;
    }

    public void unsetBit(int bit) {
        long bitMask = Long.rotateLeft(1, bit);
        bitMaskValue ^= bitMask;
    }

    public void methodToPass() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
    public boolean isBitSet(int bit) {
        long bitMask = Long.rotateLeft(1, bit);
        long result = this.bitMaskValue & bitMask;
        if (result != 0) {
            return true;
        }
        return false;
    }
}
