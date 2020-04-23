package com.rad8329.leetcode.java.findNumberOfEvenNumbersOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNumbers() {
        Solution solution = new Solution();

        int[] example1 = {12, 345, 2, 6, 7896};
        int[] example2 = {555, 901, 482, 1771};

        //Java impl
        assertEquals(2, solution.findNumbers(example1));
        assertEquals(1, solution.findNumbers(example2));

        //Scala impl
        assertEquals(2, com.rad8329.leetcode.scala.findNumberOfEvenNumbersOfDigits.Solution.findNumbers(example1));
        assertEquals(1, com.rad8329.leetcode.scala.findNumberOfEvenNumbersOfDigits.Solution.findNumbers(example2));
    }
}