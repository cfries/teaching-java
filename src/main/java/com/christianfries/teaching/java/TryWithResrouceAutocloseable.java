/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

/**
 * try-with-resource was introduced in Java 8
 * 
 * @author Christian Fries
 */
public class TryWithResrouceAutocloseable {

	public static class MyResource implements AutoCloseable {

		@Override
		public void close() {
			System.out.println("Closing...");
		}

		public void doSomething() {
			System.out.println("doing something");
		}

		public void otherStuff() {
			System.out.println("other stuff");
//			throw new RuntimeException("failed");
		}
	}


	public static void main(String[] args) {
		
		System.out.println("Running...");
		try(var resource = new MyResource()) {

			resource.doSomething();
			resource.otherStuff();

		}
		System.out.println("Done.");
	}
}
