package org.practice.java8.lamdas.basics;

public class Test {

	public static void main(String[] args) {
		A a = new C();
		a.myMethod();
		
		A a2 = ()-> System.out.println("Heyyy!");
		a2.myMethod();

	}

}
