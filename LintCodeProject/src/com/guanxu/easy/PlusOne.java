package com.guanxu.easy;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a : plusOne(new int[]{7,9,9,9,9})) {
			System.out.print(a + ", ");
		} 
	}
	
    public static int[] plusOne(int[] digits) {
        // write your code here
    	digits[digits.length - 1] += 1;
    	for(int i = digits.length - 1; i >= 0; i--) {
    		if(digits[i] == 10) {
    			digits[i] %= 10;
    			if(i == 0) {
    				int[] temp = new int[digits.length + 1];
    				temp[0] = 1;
    				for(int j = 1; j < temp.length; j++) {
    					temp[j] = digits[j - 1];
    				}
    				digits = temp;
    			}else {
    				digits[i - 1] += 1;
    			}
    		}
    	}
    	return digits;
    }

}
