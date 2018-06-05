package com.guanxu.freshBird;

public class FindSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,2,4,3,5,0,6};
		System.out.print(secondMax(A));
	}
	
    public static int secondMax(int[] nums) {
        // write your code here
        int max = 0, second = 0;
        for(int i = 1; i< nums.length; i++){
        	if(i == 1) {
        		if(nums[i-1]< nums[i]) {
        			max = nums[i];
        			second = nums[i-1];
        		}else {
        			max = nums[i-1];
        			second = nums[i];
        		}
        	}else {
        		if(nums[i] >= max) {
        			second = max;
        			max = nums[i]; 
        		}else if(nums[i]  >= second && nums[i] <= max) {
        			second = nums[i];
        		}
        	}
        }
        return second;
    }

}
