package com.guanxu.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int reverseInteger(int n) {
        // write your code here
    	StringBuilder builder;
    	if(n < 0) {
    		builder= new StringBuilder((n+"").substring(1));
    	}else {
    		builder = new StringBuilder(n + "");
    	}
    	int result = Integer.parseInt(builder.reverse().toString());
    	return result;
    }
}
