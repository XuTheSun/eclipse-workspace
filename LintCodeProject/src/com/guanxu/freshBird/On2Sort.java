package com.guanxu.freshBird;

import com.guanxu.util.Timer;

public class On2Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,2,4,3,5,0};
		for(int i: A) {
			System.out.println(i);
		}
		System.out.println("。。。。。。。。");
		Timer.start();
		sortIntegers(A);
		Timer.finish();
		for(int i: A) {
			System.out.println(i);
		}
	}
	
    public static void sortIntegers(int[] A) {
        // write your code here
            for(int j = 0; j < A.length; j++){
                for(int i = 0; i < A.length-1; i++){
                if(A[i] > A[i+1]){
                    A[i+1]= A[i+1] ^ A[i];
                    A[i] = A[i+1]^A[i];
                    A[i+1] = A[i+1]^A[i];
                }
            }
        }
    }

}
