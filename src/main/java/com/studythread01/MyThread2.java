package com.studythread01;

public class MyThread2 extends Thread {
	
	@Override
	public void run() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("run--"+ Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		//1.实例一个线程
		//2.
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();
		

	}

}
