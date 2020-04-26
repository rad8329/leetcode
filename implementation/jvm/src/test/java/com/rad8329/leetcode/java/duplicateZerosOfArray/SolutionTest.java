package com.rad8329.leetcode.java.duplicateZerosOfArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void duplicateZeros() {
        Solution solution = new Solution();

        int[] example1 = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] example2 = {1, 2, 3};

        int[] solution1 = {1, 0, 0, 2, 3, 0, 0, 4};
        int[] solution2 = {1, 2, 3};

        //Java impl
        solution.duplicateZeros(example1);
        solution.duplicateZeros(example2);

        assertArrayEquals(solution1, example1);
        assertArrayEquals(solution2, example2);

        //Scala impl

        example1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        example2 = new int[]{1, 2, 3};

        com.rad8329.leetcode.scala.duplicateZerosOfArray.Solution.duplicateZeros(example1);
        com.rad8329.leetcode.scala.duplicateZerosOfArray.Solution.duplicateZeros(example2);

        assertArrayEquals(solution1, example1);
        assertArrayEquals(solution2, example2);
    }
}