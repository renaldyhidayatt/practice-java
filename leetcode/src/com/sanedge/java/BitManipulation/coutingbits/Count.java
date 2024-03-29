package com.sanedge.java.BitManipulation.coutingbits;

public class Count {
    public static int[] countBits(int num){
        int[] bits = new int[num+1];

        for(int i = 1; i <= num; i++){
            bits[i] = bits[i&(i-1)] + 1;
        }

        return bits;
    }
}
