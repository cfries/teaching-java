/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;

/**
 * NullPointerExceptions are more specific and report the
 * the name of the reference that (unexpectedly) null.
 * 
 * @author Christian Fries
 */
public class HelpfulNullPointerExceptions {

	public static void main(String[] args) {
		
		double[][] matrix1 = new double[10][10];

		double[][] matrix2 = null;
		
		try {
			matrix1[4][7] = 4.0;
			matrix2[4][7] = 1.0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		double[] vector = null;
		try {
			vector[5] = 4.0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}

}
