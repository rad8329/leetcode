package com.rad8329.leetcode.scala.findNumberOfEvenNumbersOfDigits

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
 * 1 <= nums[i] <= 100000
 *
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * ---------------------------------------------------------------------------------------------------------------------
 * Poor perfomance because the recursion, but the intent is to do FP, and the Scala right way
 *
 * Runtime: 488 ms
 * Memory Usage: 50.6 MB
 */
object Solution {
  def findNumbers(numbers: Array[Int]): Int = {
    numbers.map(number => (Math.log10(number) + 1).toInt).count(number => number % 2 == 0)
  }
}