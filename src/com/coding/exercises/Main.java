package com.coding.exercises;

public class Main {

	public static void main(String[] args) {
		int challengeId = 1;
		if(args.length == 2) {
			challengeId = Integer.parseInt(args[1]);
		}
		
		IChallenge challenge = ChallengeFactory.getChallenge(challengeId);
		if(challenge == null) {
			System.err.println("Challenge could not be found!");
			return;
		}
		
		challenge.solve();
	}

}
