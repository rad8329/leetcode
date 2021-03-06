package com.rad8329.leetcode.java.findNumberOfEvenNumbersOfDigits;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example 1:
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 *
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 * Example 2:
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 *
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * ---------------------------------------------------------------------------------------------------------------------
 * Runtime: 1 ms
 * Memory Usage: 39.1 MB
 */
class Solution {
    public int findNumbers(int[] numbers) {
        short counter = 0;
        byte length;

        for (short i = 0; i < numbers.length && i < 500; i++) {
            length = (byte) (Math.log10(numbers[i]) + 1);

            if (length % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }
}
