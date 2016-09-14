package lab12;

import java.util.Random;
import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Random opponent = new Random();
		RockPlayer opponent1 = new RockPlayer("");
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("Enter your name:");
		String name = scanner.next();
        System.out.println("choose an opponent");
		
		String myOpponent = scanner.next();
		

		System.out.println("Rock, Paper, or Scissors?(R,P,S)");
		String rps = scanner.next();


		 
		Player opponent;
		switch (myOpponent) {
		case "random":
			 opponent = new RandomPlayer  (" ");
			break;
		case "rock":
			opponent = new RockPlayer(" ");
			break;
		default:
			throw new IllegalArgumentException("Must type 'random' or 'rock'.");
		}

		System.out.println("Your opponent chose " + opponent.generateRoshambo());

		scanner.close();

	
		   
		
		
	}

	private static String RandomPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}
