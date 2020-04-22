package com.rad8329.leetcode.java.squaresOfaSortedArray;

import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
 * also in sorted non-decreasing order.
 *
 * Example 1:
 *
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 *
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * Note:
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * Runtime: 2 ms
 * Memory Usage: 41 MB
 */
class Solution {

    public int[] sortedSquares(int[] numbers) {
        int[] squaresOfNumbers = new int[numbers.length];

        for (short i = 0; i < numbers.length; i++) {
            squaresOfNumbers[i] = numbers[i] * numbers[i];
        }

        Arrays.sort(squaresOfNumbers);

        return squaresOfNumbers;
    }
}
