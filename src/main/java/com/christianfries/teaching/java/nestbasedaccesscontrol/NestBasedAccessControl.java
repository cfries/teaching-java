package com.christianfries.teaching.java.nestbasedaccesscontrol;

import java.util.Arrays;

import com.christianfries.teaching.java.nestbasedaccesscontrol.OuterClass.InnerClass;

public class NestBasedAccessControl {

	public static void main(String[] args) {
		
		OuterClass test = new OuterClass();
		
		var inner = test.new InnerClass();
		
		inner.innterMethodBeingPublic();

		/*
		 * The above was possible in Java 8.
		 * 
		 * The following reflection methods were added in Java 11:
		 */
		System.out.println(OuterClass.class.getNestHost().getName());
		System.out.println(InnerClass.class.getNestHost().getName());
		System.out.println(Arrays.toString(InnerClass.class.getNestMembers()));
	}
}
