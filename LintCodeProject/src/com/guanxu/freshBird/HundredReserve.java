package com.guanxu.freshBird;

import com.guanxu.util.Timer;

public class HundredReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer.start();
		System.out.println(reverseInteger(123));
		Timer.finish();

	}
    public static int reverseInteger(int number) {
        // write your code here
    	int single = number%10;
        int decade = number/10%10;
        int hundred = number/100;
        return single*100+decade*10+hundred;
    }
}
