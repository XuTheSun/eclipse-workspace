package com.guanxu.easy;

public class MinimumMovesToEqualArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,3,4};
		System.out.println(miniumStep(a));
//		for(int i = 0; i< 10; i++)
//			plusOne(a);
	}

    public static int minMoves(int[] nums) {
        // Write your code here
    	int result = 0;
    	while(!checkArray(nums)) {
    		result++;
    		plusOne(nums);
    	}
    	return result;
    }
    
    public static boolean checkArray(int[] nums) {
    	for(int i = 0; i < nums.length - 1; i++) {
    		if(nums[i] != nums[i+1]) 
    			return false;
    	}
    	return true;
    }
    
    public static void plusOne(int[] nums) {
    	int maxIndex = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] > nums[maxIndex])
    			maxIndex = i;
    	}
    	for(int j = 0; j < nums.length; j++)
    		nums[j]++;
    	System.out.println(maxIndex);
    	for(int i : nums) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    	nums[maxIndex]--;
    }
    
    public static int miniumStep(int[] nums) {
    	int result = 0;
    	int sum = 0;
    	int min = 0x0fffffff;
    	for(int i = 0; i < nums.length; i++) {
    		sum+= nums[i];
    		if(min > nums[i]) {
    			min = nums[i];
    		}
    	}
    	System.out.println(sum +" "+min);
    	result = sum - min * nums.length;
    	return result;
    }
	
}
