package com.guanxu.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(wordPatten("abba","bog bog bog bog"));
	}
	
	public static boolean wordPatten(String proto, String data) {
		String[] samples= data.split(" ");
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i< proto.length(); i++) {
			String temp = proto.charAt(i)+"";
			if(!map.containsKey(temp)) {
				if(map.containsValue(samples[i]))
					return false;
				map.put(temp, samples[i]);
			}
			else {
				if(!map.get(temp).equals(samples[i]))
					return false;
			}
		}
		return true;
	}
}
