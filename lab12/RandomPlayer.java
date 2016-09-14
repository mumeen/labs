package lab12;
import java.util.Random;

//random is a child class of player must extend child class
//child can override parents method
	public class RandomPlayer extends Player {

		
 
			// TODO Auto-generated constructor stub
		

	
			// TODO Auto-generated constructor stub
		

		public RandomPlayer(String playerName) {
			super(playerName);
			// TODO Auto-generated constructor stub
		}

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
	
