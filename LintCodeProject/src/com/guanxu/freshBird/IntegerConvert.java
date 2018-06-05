package com.guanxu.freshBird;

public class IntegerConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(intConvert(123123,16));
	}
	
	public static String intConvert(int res, int base) {
		char baseC = 'A';
		StringBuilder result = new StringBuilder();
		int dex = 0;
		if(base <=1 || base >16) {
			return "invalid base";
		}
			while(true) {
				dex = res % base;
				if(dex > 9) {
					result.append((char)(baseC + dex - 10));
				}else {
					result.append(dex);
				}
				res = res / base;
				if(res == 0) 
					break;
			}
		return result.reverse().toString();
	}

}
