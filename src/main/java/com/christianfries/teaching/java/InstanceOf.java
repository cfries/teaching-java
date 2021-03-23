/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

/**
 * InstanceOf pattern matching appeard in Java 14 (as a preview, JEP 305).
 * We may automatically specify the casted reference in an instanceof test block.
 * 
 * @author Christian Fries
 */
public class InstanceOf {

	public static void main(String[] args) {

		(new InstanceOf()).test();

	}

	private void test() {

		Object json = """
				"name" : "Fries",
				"firstname" : "Christian",
				"hobbies" : [
					"computer",
					"bike",
					"movies",
					"math",
					"family"
				]
				""";

		if(json instanceof String jsonAsString) {
			String upper = jsonAsString.toUpperCase();
			System.out.println(upper);
		}
		
		if(json instanceof Number dataAsNumber) {
			Double value = dataAsNumber.doubleValue() * 2.0;
			System.out.println(value);
		}
	}

}
