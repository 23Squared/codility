package com.github.codility.binaryGap;

public class Solution {

    public static void main(String[] args) {}

    public int solution(int N) {
        int currentBit;
        int count = -1;
        int maxGap = 0;
        boolean foundGapStart = false;

        // Repeat until we've shifted N across to the right by
        // all its bits ie it's 0
        while(N > 0) {
            currentBit = N & 1;

            if(currentBit == 0 && foundGapStart) {
                count++;
            }

            if(currentBit == 1) {
                // Found start of gap
                foundGapStart = true;
                maxGap = (count > maxGap) ? count : maxGap;
                count = 0;
            }

            // Shift N right by 1 bit
            N = N >> 1;
        }

        return maxGap;
    }
}
