package com.rad8329.leetcode.scala.squaresOfaSortedArray

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
 * Poor perfomance because the recursion, but the intent is to do FP, and the Scala right way
 *
 * Runtime: 588 ms
 * Memory Usage: 52.3 MB
 */
object Solution {
  def sortedSquares(numbers: Array[Int]): Array[Int] = numbers.map(number => number * number).sorted
}
