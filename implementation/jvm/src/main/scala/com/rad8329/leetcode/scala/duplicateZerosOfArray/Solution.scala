package com.rad8329.leetcode.scala.duplicateZerosOfArray

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements
 * to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 * Note:
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 *
 * https://leetcode.com/problems/duplicate-zeros/
 *
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * Runtime: 888 ms
 * Memory Usage: 67.2 MB
 */
object Solution {

  def duplicateZeros(numbers: Array[Int]): Unit = {
    var i = 0

    while (i < numbers.length - 1) {
      if (numbers(i) == 0 && i + 1 < numbers.length) {
        shifOneElementToRight(numbers, i)
        numbers(i + 1) = 0
        i = i + 1
      }

      i = i + 1
    }
  }

  private def shifOneElementToRight(numbers: Array[Int], index: Int) {
    var i = numbers.length - 2

    while (i > index) {
      numbers(i + 1) = numbers(i)
      i = i - 1
    }
  }
}
