package com.guanxu.easy;

public class IntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2,3,4,5,6,7};
		int[] result;
		result = twoSum(data, 11);
		System.out.println("{"+result[0]+", "+result[1]+"}");
	}

    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
    	int[] result = new int[2];
    	for(int i = 0; i < numbers.length - 1; i++) {
    		result[0] = i;
    		for(int j = i + 1; j < numbers.length; j++) {
    			if(numbers[i] + numbers[j] == target) {
    				result[1] = j;
    				return result;
    			}
    		}
    	}
    	return null;
    }
	
}