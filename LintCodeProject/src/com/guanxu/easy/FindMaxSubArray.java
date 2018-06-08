package com.guanxu.easy;

public class FindMaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxSubArray(int[] nums) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = nums[i];
            }else{
                curSum += nums[i];
            }
            if(curSum > max)
                max = curSum;
        }
        return max;
    }

}
