package com.guanxu.easy;

public class PoorPig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // Write your code here
        int count = minutesToTest / minutesToDie + 1;
        int temp = count;
        int i = 1;
        for(;; i++) {
        	 if(temp >= buckets) {
        		 break;
        	 }
        	 temp = temp * count;
        }
        return i;
    }

}
