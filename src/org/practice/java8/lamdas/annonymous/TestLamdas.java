package org.practice.java8.lamdas.annonymous;

public class TestLamdas {
	
	public static void main(String[] args) {
		Thread t = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("From Lamda inner class Thread [" + i + "]");
			}
		});
		
		t.run();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread ["+i+"]");
		}
		
		
	}
}
