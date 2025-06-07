package dsa.practise.arrays_hashing;

import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        int longestInteger = 0;
        for(int num: nums){
            numSet.add(num);
        }

        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currentNumber = num;
                int currentLength = 1;
                while(numSet.contains(currentNumber+1)){
                    currentNumber +=1;
                    currentLength +=1;
                }
                longestInteger = Math.max(longestInteger,currentLength);
            }
        }

        return longestInteger;
    }
}
