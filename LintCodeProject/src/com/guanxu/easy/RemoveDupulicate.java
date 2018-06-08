package com.guanxu.easy;

public class RemoveDupulicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int removeDupulicate(int[] nums) {
        int curNum = 0;
        int validIndex = 1;
        int newLength = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                curNum = nums[i];
                continue;
            }
            if(curNum != nums[i]){
                nums[validIndex] = nums[i];
                validIndex++;
            }else{
                newLength--;
            }
            curNum = nums[i];
        }
        return newLength;
	}

}
