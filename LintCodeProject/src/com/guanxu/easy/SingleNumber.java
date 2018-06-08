package com.guanxu.easy;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(singleNumber(new int[] {1,2,2,1,4}));
	}
	
    public static int singleNumber(int[] A) {
        // write your code here
    	int result = 0;
    	for(int i = 0; i < A.length; i++) {
    		result ^= A[i];
    	}
    	return result;
    }

}
