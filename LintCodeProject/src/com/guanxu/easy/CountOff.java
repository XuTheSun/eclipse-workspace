package com.guanxu.easy;

import com.guanxu.util.TimerRunnable;

public class CountOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerRunnable() {
			@Override
			public void runWithRecord() {
				// TODO Auto-generated method stub
				for(int i = 1; i<= 30; i++) {
					System.out.println(count(i));
				}
			}}.run();
	}
	
	public static String count(int num) {
		String prototype = "1";
		StringBuilder result = new StringBuilder(prototype);
		if(num <= 1) {
			return 1+"";
		}
		for(int i = 0; i < num - 1; i++) {
			int count = 1;
			String cur = "";
			String next = "";
			prototype = result.toString();
			result.delete(0, result.length());
			for(int k = 0; k < prototype.length(); k++) {
				cur = prototype.substring(k, k+1);
				if((k+2)<=prototype.length()) {
					next = prototype.substring(k+1,k+2);
				}else {
					next = "";
				}
				if(cur.equals(next)) {
					count++;
				}else {
					result.append(count + cur);
					count = 1;
				}
			}
		}
		return result.toString();
	}

}
