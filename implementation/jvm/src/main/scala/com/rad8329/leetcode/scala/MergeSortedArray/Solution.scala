package com.rad8329.leetcode.scala.MergeSortedArray

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to
 * hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * Runtime: 460 ms
 * Memory Usage: 50.5 MB
 */
object Solution {
  def merge(numbers1: Array[Int], m: Int, numbers2: Array[Int], n: Int): Unit = {

    if (n != 0) {
      var i = 0
      var j = 0
      var shiftedElements = 0

      while (i < n) {
        var wasInserted = false

        j = shiftedElements

        while (j < m + shiftedElements && !wasInserted) {

          if (numbers2(i) < numbers1(j) && j + 1 < numbers1.length) {

            shifOneElementToRight(numbers1, j)
            numbers1(j) = numbers2(i)

            wasInserted = true
            shiftedElements = shiftedElements + 1
          }

          j = j + 1
        }

        if (!wasInserted) {
          numbers1(i + j - shiftedElements) = numbers2(i)
        }

        i = i + 1
      }
    }
  }

  private def shifOneElementToRight(numbers: Array[Int], index: Int) {
    var i = numbers.length - 2

    while (i >= index) {
      numbers(i + 1) = numbers(i)
      i = i - 1
    }
  }
}
