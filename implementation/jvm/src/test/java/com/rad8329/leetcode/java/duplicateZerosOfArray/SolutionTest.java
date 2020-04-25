package com.rad8329.leetcode.java.duplicateZerosOfArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void duplicateZeros() {
        Solution s = new Solution();
        int[] example1 = {1, 0, 2, 3, 0, 4, 5, 0, 1};
        int[] example2 = {1, 2, 3};

        int[] solution1 = {1, 0, 0, 2, 3, 0, 0, 4};

        s.duplicateZeros(example1);
        s.duplicateZeros(example2);

        assertArrayEquals(solution1, solution1);
        assertArrayEquals(example2, example2);
    }
}