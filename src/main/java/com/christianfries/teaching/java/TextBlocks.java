/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

/**
 * TextBlocks allow easy definition of String literals containing newline or quotation marks ".
 * 
 * @author Christian Fries
 */
public class TextBlocks {

	public static void main(String[] args) {

		(new TextBlocks()).test();

	}

	private void test() {

		String json = """
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

		String code = """				
				__kernel void add(__global float* result, __global float *vectorLeft, __global float* vectorRight) {
					size_t i = get_global_id(0);
					
					result[i] = vectorLeft[i] + vectorRight[i];
				}
				""";

		System.out.println(json);

		System.out.println(code);
	}

}
