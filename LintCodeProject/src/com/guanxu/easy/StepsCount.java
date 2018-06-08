package com.guanxu.easy;

public class StepsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
    public static int climbStairsX(int n) {
        // write your code here
    	if(n == 1)
    		return 1;
    	if(n == 2)
    		return 2;
    	return climbStairs(n - 1) + climbStairs(n - 2);
    }
    
    public static int climbStairs(int n) {
        // write your code here
    	int[] set = new int[n];
    	set[0] = 1;
    	set[1] = 2;
    	for(int i = 2; i < n; i++) {
    		set[i] = set[i - 1]+ set[i - 2];
    	}
    	return set[n - 1];	
    }
}
