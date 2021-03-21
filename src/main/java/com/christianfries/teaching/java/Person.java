/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

public record Person(String firstname, String lastname, int id, boolean test)
{
	public String firstname() {
		return this.firstname.toUpperCase();
	}
}
