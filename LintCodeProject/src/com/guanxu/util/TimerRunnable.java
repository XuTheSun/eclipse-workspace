package com.guanxu.util;

public abstract class TimerRunnable implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Timer.start();
		runWithRecord();
		Timer.finish();
	}
	
	public abstract void runWithRecord();
}
