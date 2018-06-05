package com.guanxu.util;

public class Timer {
	
	private static long startTime = 0L;
	
	public static void start() {
		startTime = System.currentTimeMillis();
	}
	
	public static void finish() {
		if(startTime != 0) {
			System.out.println("Total Time:"+(System.currentTimeMillis() - startTime));
			startTime = 0L;
		}
			
		else throw new IllegalStateException("Please invoke the start() method.");
	}
	public static void clear() {
		startTime = 0L;
	}
}
