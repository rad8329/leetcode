package com.rad8329.leetcode.java.squaresOfaSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortedSquares() {

        Solution solution = new Solution();

        int[] example1 = {-4, -1, 0, 3, 10};
        int[] example2 = {-7, -3, 2, 3, 11};

        int[] solution1 = {0, 1, 9, 16, 100};
        int[] solution2 = {4, 9, 9, 49, 121};

        //Java impl
        assertArrayEquals(solution1, solution.sortedSquares(example1));
        assertArrayEquals(solution2, solution.sortedSquares(example2));

        //Scala impl
        assertArrayEquals(solution1, com.rad8329.leetcode.scala.squaresOfaSortedArray.Solution.sortedSquares(example1));
        assertArrayEquals(solution2, com.rad8329.leetcode.scala.squaresOfaSortedArray.Solution.sortedSquares(example2));
    }
}