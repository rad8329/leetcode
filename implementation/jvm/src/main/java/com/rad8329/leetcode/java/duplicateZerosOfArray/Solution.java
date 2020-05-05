package com.rad8329.leetcode.java.duplicateZerosOfArray;

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
 * Runtime: 14 ms
 * Memory Usage: 39.8 MB
 */
public class Solution {
    public void duplicateZeros(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 && i + 1 < numbers.length) {
                shifOneElementToRight(numbers, i);
                numbers[i + 1] = 0;
                i++;
            }
        }
    }

    private void shifOneElementToRight(int[] numbers, int index) {
        int i = numbers.length - 2;
        while (i >= index) {
            numbers[i + 1] = numbers[i];
            i--;
        }
    }
}
