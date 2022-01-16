package com.coding.exercises;

public class ChallengeFactory {
	public static IChallenge getChallenge(int number) {
		switch(number) {
		case 1:
			return new ChallengeOne();
		}
		
		return null;
	}
}
