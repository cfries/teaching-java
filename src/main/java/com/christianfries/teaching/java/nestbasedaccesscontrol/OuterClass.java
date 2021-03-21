/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java.nestbasedaccesscontrol;

public class OuterClass {

	private void outerMethodBeingPrivate() {
		System.out.println("Called private outer method.");
	}
	
	public class InnerClass {
		
		public void innterMethodBeingPublic() {
			System.out.println("Called public inner method.");
			outerMethodBeingPrivate();
		}
	}
}
