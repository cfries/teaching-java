package com.christianfries.teaching.java;

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
