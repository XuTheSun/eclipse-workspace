package com.guanxu.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int majorityNumber(List<Integer> nums) {
        // write your code here
    	Map<Integer, Integer> countMap = new HashMap<>();
    	for(int i = 0; i < nums.size(); i++) {
    		if(countMap.containsKey(nums.get(i))) {
    			countMap.put(nums.get(i), countMap.get(nums.get(i)).intValue() + 1);
    		}else {
    			countMap.put(nums.get(i), 1);
    		}
    	}
    	int maxKey = 0;
    	int max = 0;
    	for(Entry<Integer, Integer> i : countMap.entrySet()) {
    		if(i.getValue() > max) {
    			max = i.getValue();
    			maxKey = i.getKey();
    		}
    	}
    	return maxKey;
    }
    
    public static int majorityNumber1(List<Integer> nums) {
    	int candidate = 0;
    	int count = 0;
    	for(Integer i : nums) {
    		if(count == 0) {
    			candidate = i;
    			count++;
    		}else {
    			if(candidate == i)
    				count++;
    			else
    				count--;
    		}
    	}
    	return candidate;
    }
    
}
