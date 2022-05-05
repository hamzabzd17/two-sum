package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwoSumApplication {

	public static void main(String[] args) {
		int[] numbers = { 4, 2, 3, 7, 9, 4 };
		int target = 9;
		SpringApplication.run(TwoSumApplication.class, args);
		System.out.println("Two sum result: " + twoSum(numbers, target));
	}

	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int delta = target - numbers[i];
			if (visitedNumbers.containsKey(delta)) {
				return new int[] { i, visitedNumbers.get(delta) };
			}
			visitedNumbers.put(numbers[i], i);
		}
		return new int[] { -1, -1 };

	}

}
