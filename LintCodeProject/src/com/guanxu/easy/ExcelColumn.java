package com.guanxu.easy;

public class ExcelColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(100));

	}
	
    public static String convertToTitle(int n) {
        // write your code here
        int num = n;
        StringBuilder result = new StringBuilder();
        while(num > 0){
            char c = (char)('A');
            int temp = num % 26;
            num /= 26;
            char r = (char) (c+temp-1);
            result.append(r);
        }
        return result.toString();
    }
    
}
