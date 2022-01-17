package com.coding.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeOne implements IChallenge {

	@Override
	public void solve() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 10, 11, 100, 89, 97, 111, 90);
		List<Integer> evens = new ArrayList<Integer>();
		List<Integer> odds = new ArrayList<Integer>();
		
		for(Integer value : input) {
			if(value % 2 == 0) {
				evens.add(value);
			} else {
				odds.add(value);
			}
		}
		
		for(Integer odd : odds) {
			evens.add(odd);
		}
		
		System.out.printf("Solution: ");
		for(int i = 0; i < evens.size() -1; i++) {
			System.out.printf("%d, ", evens.get(i));
		}
		System.out.printf("%d\n", evens.get(evens.size() - 1));
	}
}
