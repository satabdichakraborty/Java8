package org.practice.java8.predicates.joins;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		int[] x = { 10, 20, 33, 40, 55, 60, 70, 80, 90, 103 };

		Predicate<Integer> p = i -> (i > 50);
		Predicate<Integer> p2 = i -> (i % 2 == 0);

		System.out.println("Greater than 50: ");
		testPredicates(p, x);
		

		System.out.println("Even numbers in array: ");
		testPredicates(p2, x);
		
		System.out.println("Numbers less than 50: ");
		testPredicates(p.negate(), x);
		
		System.out.println("Numbers less than 50: ");
		testPredicates(p.and(p2), x);
		
		System.out.println("Numbers less than 50: ");
		testPredicates(p.and(p2), x);

	}

	static void testPredicates(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
	}

}
