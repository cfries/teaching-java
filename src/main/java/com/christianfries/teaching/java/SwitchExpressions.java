/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

/**
 * The classical switch statement is control flow (execute differnt code blocks).
 * 
 * A switch expression can be interpreted as a functions that returns a value. Instead of the keyword return the value is 
 * 
 * @author fries
 */
public class SwitchExpressions {

	public static void main(String[] args) {

		(new SwitchExpressions()).test();

	}

	private void test() {

		String[] selectors = new String[] { "green", "blue", "red" };

		for(String selector : selectors) {

			double x = 17.0;
			
			Double value = switch(selector) {
				case "blue" -> 1.0;
				case "green" -> {
					double a = x * 2.0;
					yield a;
				}
				case "red" -> { yield calc(); }
				default -> throw new IllegalArgumentException("Unexpected value: " + selector);	
			};
			
			System.out.println(selector + "\t" + value);
		}
	}

	private Double calc() {
		// TODO Auto-generated method stub
		return 42.0;
	}

}
