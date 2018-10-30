package org.practice.java8.lamdas.annonymous;

public class Test {
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("From annonymous inner class Thread [" + i + "]");
				}
			}
		});
		
		t.run();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread ["+i+"]");
		}
		
		
	}
}
