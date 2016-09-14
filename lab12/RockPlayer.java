package lab12;

public class RockPlayer extends Player{
	 
	
	

	public RockPlayer(String playerName) {
		super(playerName);
		// TODO Auto-generated constructor stub
	}

	@Override
		public Roshambo generateRoshambo() {
			return Roshambo.ROCK;
		}


}

