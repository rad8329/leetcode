package com.rad8329.leetcode.findMaxConsecutiveOnes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testFindMaxConsecutiveOnes() {
        
        int[] numbers = {1,1,1,0,1,1};
        
        Solution solution = new Solution();
       
        assertEquals(3,  solution.findMaxConsecutiveOnes(numbers));       
    }    
}
