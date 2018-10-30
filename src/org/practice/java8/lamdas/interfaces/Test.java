package org.practice.java8.lamdas.interfaces;

public class Test {
	
	public static void main(String[] args) {
		/*MyRunnableImpl r = new MyRunnableImpl();
		Thread t = new Thread(r);
		t.run();*/
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread ["+i+"]");
		}
		
		Runnable r1 = ()-> 
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread from lamda runnable ["+i+"]");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.run();
	}
}
