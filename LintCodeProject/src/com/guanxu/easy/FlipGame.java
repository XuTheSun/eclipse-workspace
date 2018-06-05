package com.guanxu.easy;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String s : generatePossibleNextMoves("+----+-++-++--+++-+--+----+-+-+-+++--+++")) {
			System.out.println(s);
		}
	}
	
    public static List<String> generatePossibleNextMoves(String s) {
        // write your code here
    	List<String> result = new ArrayList<>();
    	final char a = '+';
    	final char b = '-';
    	for(int i = 0; i < s.length() - 1; i ++) {
    		if(s.charAt(i) == s.charAt(i+1)) {
        		char c = s.charAt(i);
        		if(c == a) {
        			result.add(s.substring(0, i)+b+b+s.substring(i+2));
        		}
//        		else if(c == b) {
//        			result.add(s.substring(0, i)+a+a+s.substring(i+2));
//        		}
    		}
    	}
    	return result;
    }
}
