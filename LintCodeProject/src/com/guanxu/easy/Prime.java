package com.guanxu.easy;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countPrime1(155)+"");
	}
	
	public static int countPrime(int num) {
		int count = 0;
		for(int i = 2; i<= num; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int num){
		
		for(double i = 2; i <= Math.sqrt((double)num);i++) {
			if(num % i ==  0) {
				return false;
			}
		}
		return true;
	}
	
	public static int countPrime1(int num) {
		int count = 0;
		boolean[] isPrime = new boolean[num+1];
		for(int a = 0; a<= num; a++) {
			isPrime[a] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i < num; i++) {
			if(isPrime[num]) {
				for(int j = 2; j*i<num ; j++) {
					isPrime[i*j] = false;
				}
			}
		}
		for(boolean b : isPrime) {
			if(b) {
				count++;
			}
		}
		return count - 1;
	}

}
