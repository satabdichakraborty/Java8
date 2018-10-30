package org.practice.java8.functions;

public class MethodRefDemo {
	
	public static void myRunnable(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread ["+i+"]");
		}
	}

	public static void main(String[] args) {
		Runnable r = MethodRefDemo::myRunnable;
		
		Thread t = new Thread(r);
		
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread ["+i+"]");
		}

	}

}
