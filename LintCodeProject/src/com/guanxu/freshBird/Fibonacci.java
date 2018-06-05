package com.guanxu.freshBird;

import com.guanxu.util.Timer;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer.start();
		for(int i = 1; i <= 50; i++) {
			System.out.println(fibonacci(i));
		}
//		Timer.finish();
	}
	
    public static int fibonacci1(int n) {
        // write your code here
        if(n == 1)
        return 0;
        else if(n == 2)
        return 1;
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
	
     public static int fibonacci(int n) {
    	 if(n == 1)
    		 return 0;
    	 else if(n == 2)
    		 return 1;
    	 else {
    		 int a=0,b=1;
    		 for(int i = 3; i <= n; i++ ) {
    			 b = a+b;
    			 a = b-a;
    		 }
    		 return b;
    	 }
     }

}
