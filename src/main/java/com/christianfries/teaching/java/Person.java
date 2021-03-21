package com.christianfries.teaching.java;

public record Person(String firstname, String lastname, int id, boolean test)
{
	public String firstname() {
		return this.firstname.toUpperCase();
	}
}
