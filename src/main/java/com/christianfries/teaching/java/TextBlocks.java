package com.christianfries.teaching.java;

/**
 * The classical switch statement is control flow (execute differnt code blocks).
 * 
 * A switch expression can be interpreted as a functions that returns a value. Instead of the keyword return the value is 
 * 
 * @author fries
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
