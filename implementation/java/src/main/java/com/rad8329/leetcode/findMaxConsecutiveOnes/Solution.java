package com.rad8329.leetcode.findMaxConsecutiveOnes;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three digits are consecutive
 * 1s. The maximum number of consecutive 1s is 3.
 *  *
 * Note: The input array will only contain 0 and 1. The length of input array is a positive integer and will not exceed
 * 10,000
 *
 * https://leetcode.com/problems/max-consecutive-ones/
 */
class Solution {

    public int findMaxConsecutiveOnes(int[] numbers) {

        short counterOfConsecutiveOnes = 0;
        short maxNumberOfConsecutiveOnes = 0;

        for (int number : numbers) {
            if (number == 1) {
                counterOfConsecutiveOnes++;

                if (counterOfConsecutiveOnes > maxNumberOfConsecutiveOnes) {
                    maxNumberOfConsecutiveOnes = counterOfConsecutiveOnes;
                }
            } else {
                counterOfConsecutiveOnes = 0;
            }
        }

        return maxNumberOfConsecutiveOnes;
    }
}
