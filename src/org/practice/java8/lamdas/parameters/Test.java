package org.practice.java8.lamdas.parameters;

public class Test {

	public static void main(String[] args) {
		Sum s = (x, y) -> System.out.println("Sum is : " + (x + y));

		s.add(4, 5);

		s.add(40, 50);

	}

}
