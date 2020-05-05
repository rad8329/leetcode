package com.rad8329.leetcode.java.MergeSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {

        int[] example1_1 = {1, 2, 3, 0, 0, 0};
        int[] example1_2 = {2, 5, 6};
        int[] example2_1 = {1, 2, 3, 4, 0, 0, 0};
        int[] example2_2 = {2, 5, 6};
        int[] example3_1 = {1};
        int[] example3_2 = {};
        int[] example4_1 = {0};
        int[] example4_2 = {1};
        int[] example5_1 = {4, 0, 0, 0, 0, 0};
        int[] example5_2 = {1, 2, 3, 5, 6};

        int[] solution1 = {1, 2, 2, 3, 5, 6};
        int[] solution2 = {1, 2, 2, 3, 4, 5, 6};
        int[] solution3 = {1};
        int[] solution4 = {1};
        int[] solution5 = {1, 2, 3, 4, 5, 6};

        //Scala impl

        com.rad8329.leetcode.scala.MergeSortedArray.Solution.merge(example1_1, 3, example1_2, 3);
        com.rad8329.leetcode.scala.MergeSortedArray.Solution.merge(example2_1, 4, example2_2, 3);
        com.rad8329.leetcode.scala.MergeSortedArray.Solution.merge(example3_1, 1, example3_2, 0);
        com.rad8329.leetcode.scala.MergeSortedArray.Solution.merge(example4_1, 0, example4_2, 1);
        com.rad8329.leetcode.scala.MergeSortedArray.Solution.merge(example5_1, 1, example5_2, 5);

        assertArrayEquals(solution1, example1_1);
        assertArrayEquals(solution2, example2_1);
        assertArrayEquals(solution3, example3_1);
        assertArrayEquals(solution4, example4_1);
        assertArrayEquals(solution5, example5_1);
    }
}