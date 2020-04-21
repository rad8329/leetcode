package com.rad8329.leetcode.scala.findMaxConsecutiveOnes

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 *
 * Explanation: The first two digits or the last three digits are consecutive
 * 1s. The maximum number of consecutive 1s is 3.
 *
 * Note: The input array will only contain 0 and 1. The length of input array is a positive integer and will not exceed
 * 10,000
 *
 * https://leetcode.com/problems/max-consecutive-ones/
 *
 * ---------------------------------------------------------------------------------------------------------------------
 * Poor perfomance because the recursion, but the intent is to do FP, and the Scala right way
 *
 * Runtime: 596 ms
 * Memory Usage: 52.3 MB
 */
object Solution {
  def findMaxConsecutiveOnes(numbers: Array[Int]): Int = {
    @scala.annotation.tailrec
    def recursionFindMaxConsecutiveOnes(numbers: Array[Int],
                                        index: Int = 0,
                                        maxNumberOfConsecutiveOnes: Int = 0,
                                        counterOfConsecutiveOnes: Int = 0
                                       ): Int = {
      if (index >= numbers.length) maxNumberOfConsecutiveOnes
      else if (numbers(index) == 1) {
        val counter: Int = counterOfConsecutiveOnes + 1
        recursionFindMaxConsecutiveOnes(numbers, index + 1, Math.max(counter, maxNumberOfConsecutiveOnes), counter)
      } else recursionFindMaxConsecutiveOnes(numbers, index + 1, maxNumberOfConsecutiveOnes)
    }

    recursionFindMaxConsecutiveOnes(numbers)
  }
}
