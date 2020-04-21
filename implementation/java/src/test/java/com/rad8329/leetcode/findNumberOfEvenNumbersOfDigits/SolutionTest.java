package com.rad8329.leetcode.findNumberOfEvenNumbersOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNumbers() {
        Solution solution = new Solution();

        int[] example1 = {12, 345, 2, 6, 7896};
        assertEquals(2, solution.findNumbers(example1));

        int[] example2 = {555, 901, 482, 1771};
        assertEquals(1, solution.findNumbers(example2));
    }
}