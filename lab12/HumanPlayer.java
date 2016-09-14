package lab12;

import java.util.Random;

public class HumanPlayer extends Player {

	public HumanPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}
//the signature is in every class because of override
	@Override
	public Roshambo generateRoshambo() {
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;
	switch(answer)
	{
	case 1:
		return Roshambo.ROCK;
	case 2:
		return Roshambo.SCISSORS;
	case 3:
		return Roshambo.PAPER;
	default:
		return null;


}
	}
}
//