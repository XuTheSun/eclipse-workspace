package com.guanxu.easy;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static boolean isPalindrome(int num) {
        // write your code here
    	char[] c = (num+"").toCharArray();
    	if(c.length > 1) {
    		for(int i = 0; i < c.length / 2; i++) {
        		if(c[i] != c[c.length - i - 1]) {
        			return false;
        		}
        	}
    	}
    	
    	return true;
    }
}