package org.practice.java8.lamdas.interfaces;

public class MyRunnableImpl implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("My Chid Thread["+i+"]");
		}
		
	}

}
