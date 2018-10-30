package org.practice.java8.predicates.joins;

import java.util.function.Predicate;

public class PredicateTests {

	public static void main(String[] args) {
		int[] x = { 0, 7, 10, 20, 30, 40, 50, 60, 70, 73 };

		Predicate<Integer> p1 = i -> (i > 10);
		Predicate<Integer> p2 = i -> (i % 2 == 0);

		// Greater than 10
		System.out.println("Greater than 10");
		testPredicates(p1, x);

		// NOT Greater than 10
		System.out.println("NOT Greater than 10");
		testPredicates(p1.negate(), x);

		// Even numbers
		System.out.println("Even numbers");
		testPredicates(p2, x);

		// Greater than 10 and even numbers
		System.out.println("Greater than 10 and even numbers");
		testPredicates(p1.and(p2), x);

		// Greater than 10 or even
		System.out.println("Greater than 10 or even");
		testPredicates(p1.or(p2), x);

	}

	private static void testPredicates(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

}
