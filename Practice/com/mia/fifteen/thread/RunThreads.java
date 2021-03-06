 package com.mia.fifteen.thread;

public class RunThreads implements Runnable{
	
	public void run() {
		
		for(int i=0;i<25;i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");
		}
	}

	public static void main(String[] args) {
		
		RunThreads runner = new RunThreads();
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner);
		alpha.setName("Alpha thread"); // setName() 통해 스레드이름 명명
		beta.setName("Beta thread");
		alpha.start();
		beta.start();
	}
}
