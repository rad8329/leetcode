package com.rad8329.leetcode.java.squaresOfaSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortedSquares() {

        int[] example1 = {-4, -1, 0, 3, 10};
        int[] example2 = {-7, -3, 2, 3, 11};

        assertArrayEquals(
                new int[]{0, 1, 9, 16, 100},
                com.rad8329.leetcode.scala.squaresOfaSortedArray.Solution.sortedSquares(example1)
        );

        assertArrayEquals(
                new int[]{4, 9, 9, 49, 121},
                com.rad8329.leetcode.scala.squaresOfaSortedArray.Solution.sortedSquares(example2)
        );
    }
}