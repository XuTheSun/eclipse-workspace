package com.guanxu.easy;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,1,4,56,8,9,2,3,1};
		System.out.println(containsNearbyDuplicate(a, 2));
	}
	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Write your code here
    	for(int i = 0; i < nums.length; i++) {
    		for(int j = i; j < nums.length; j++) {
    			if(j != i && nums[i] == nums[j] && Math.abs(j - i) <=  k) 
    				return true;
    		}
    	}
    	return false;
    }

}
