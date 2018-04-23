package com.studythread01;

import java.util.Timer;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run--" + Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		//1.第一步继承Thread类
		//2.重写Thread类的run()方法
		//3.创建一个线程实例
		//4.调用实例方法 start()启动线程
		
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		//1.先输出主线程，停留10秒输出异步线程
		System.out.println("main --" + Thread.currentThread().getName());
		
		
		
		
	}

}
