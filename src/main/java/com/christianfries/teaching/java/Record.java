/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

/**
 * Records are part of Java 16. A preview was given in Java 14 (JEP 359).
 * 
 * @author Christian Fries
 */
public class Record {
	
	public static void main(String[] args) {

		(new Record()).test();

	}

	private void test() {
		Person person = new Person("Christian", "Fries", 19, false);

		System.out.println(person);
		
		if(person.firstname().equals("Christian")) {
			System.out.println("true");
		}
	}
}
