package com.guanxu.easy;

public class AddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(addStrings("331255124902346234523530", "1234123412341262364435321522"));
	}
	
    public static String addStrings(String num1, String num2) {
        // write your code here
        int size = Math.max(num1.length(),num2.length());
        int[] result = new int[size+1];
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< size; i++){
            int a = 0;
            int b = 0;
            if(i < num1.length()){
                a = num1.charAt(num1.length() - i - 1) - '0';
            }
            if(i < num2.length()){
                b = num2.charAt(num2.length() - i - 1) - '0';
            }
            result[i] = a + b;
            System.out.println(i+" "+result[i]);
        }        
        for(int j = 0; j < result.length; j++){
            if((result[j]/10) > 0){
                result[j + 1] += result[j]/10;
                result[j] = result[j]%10;
            }
        }
        for(int k = 0; k < result.length; k++){
        	System.out.println(k+" "+result[k]);
            builder.append(result[result.length - k -1]);
        }
        if(builder.toString().charAt(0) == '0') {
        	return builder.toString().substring(1);
        }
        return builder.toString();
    }

}
