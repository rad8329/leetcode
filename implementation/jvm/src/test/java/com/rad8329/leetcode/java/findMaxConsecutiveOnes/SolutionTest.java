package com.rad8329.leetcode.java.findMaxConsecutiveOnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testFindMaxConsecutiveOnes() {
        Solution solution = new Solution();
        int[] numbers = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1};

        //Java impl
        assertEquals(4, solution.findMaxConsecutiveOnes(numbers));

        //Scala impl
        assertEquals(4, com.rad8329.leetcode.scala.findMaxConsecutiveOnes.Solution.findMaxConsecutiveOnes(numbers));
    }
}
