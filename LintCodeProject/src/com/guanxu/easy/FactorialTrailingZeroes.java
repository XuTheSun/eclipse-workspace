package com.guanxu.easy;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialZeroes(4));
	}
	
    public static int factorialZeroes(int n) {
        int result = 0;
        long tmp = n; // Ϊ�˷�ֹi*5����int�ı���ʾ��Χ

        for (long i = 5; i <= tmp; i *= 5) {
            result += n / i;
        }

        return result;
    }
	
	public static int findZero(int num) {
		int count = 0;
		while(num%5 == 0) {
			count++;
			num/=5;
		}
		return count;
	}
}
class Myinteger{
	
}

