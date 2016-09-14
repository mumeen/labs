package lab8;

import java.util.ArrayList;
import java.util.Scanner;


public class Batter {
	public class AtBat {
	
	private String name;
	private ArrayList<Integer>atBats = new ArrayList<Integer>();

	public void Batter(String batterName, ArrayList<Integer>hits){
		this.name= batterName;
		this.atBats = hits;
	}
	
	public String playerName;
	
	
	public String getName(String playerName)
	{
		return playerName;
	}
		public double calculateBatAverage(int totalAtBats, int totalBasesEarned)
		{
			double average =  (double)totalBasesEarned/totalAtBats;
			return average;
	
	
		}
	public double calculateSluggerPct(int totalAtBats, int totalBasesEarned)
	{
		double pct = (double)totalAtBats/totalBasesEarned;
		return pct;
	}

}

	public double calculateBatAverage(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}