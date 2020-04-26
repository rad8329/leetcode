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
 * Runtime: 792 ms
 * Memory Usage: 67.7 MB
 */
object Solution {

  def duplicateZeros(numbers: Array[Int]): Unit = {
    var leftPivot = 0

    while (leftPivot < numbers.length - 1) {
      if (numbers(leftPivot) == 0 && leftPivot + 1 < numbers.length) {

        var rightPivot = numbers.length - 2

        while (rightPivot > leftPivot) {
          numbers(rightPivot + 1) = numbers(rightPivot)
          rightPivot = rightPivot - 1
        }

        numbers(leftPivot + 1) = 0

        leftPivot = leftPivot + 1
      }

      leftPivot = leftPivot + 1
    }
  }
}
