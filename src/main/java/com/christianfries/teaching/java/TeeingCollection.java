/*
 * (c) Copyright Christian P. Fries, Germany. Contact: email@christian-fries.de.
 *
 * Created on 21.03.2021
 */
package com.christianfries.teaching.java;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TeeingCollection {

	public static void main(String[] args) {

		Collector collector = new Collector() {

			@Override
			public Supplier<Double> supplier() {
				return () -> Double.valueOf(0.0);
			}

			@Override
			public BiConsumer accumulator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BinaryOperator combiner() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Function finisher() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Set characteristics() {
				// TODO Auto-generated method stub
				return null;
			}};

			List<List<Integer>> list = List.of(
					List.of(1, 2, 3, 5, 1, 5, 6),
					List.of(1, 2, 3, 5, 1, 5, 6),
					List.of(1, 2, 3, 5, 1, 5, 6),
					List.of(1, 2, 3, 5, 1, 5, 6)
					);
			list.stream().collect(Collectors.teeing(null, null, null));
	}
}
