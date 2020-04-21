package com.rad8329.leetcode.scala.findMaxConsecutiveOnes

object Solution {
  def findMaxConsecutiveOnes(numbers: Array[Int]): Int = {
    @scala.annotation.tailrec
    def recursionfindMaxConsecutiveOnes(numbers: Array[Int],
                                        index: Int = 0,
                                        maxNumberOfConsecutiveOnes: Int = 0,
                                        counterOfConsecutiveOnes: Int = 0
                                       ): Int = {
      if (index >= numbers.length) maxNumberOfConsecutiveOnes
      else if (numbers(index) == 1) {
        val counter = counterOfConsecutiveOnes + 1
        recursionfindMaxConsecutiveOnes(numbers.drop(1), index + 1, Math.max(counter, maxNumberOfConsecutiveOnes), counter)
      } else recursionfindMaxConsecutiveOnes(numbers.drop(1), index + 1, maxNumberOfConsecutiveOnes)
    }

    recursionfindMaxConsecutiveOnes(numbers)
  }
}
