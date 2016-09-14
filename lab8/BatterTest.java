package lab8;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BatterTest {

	
	@Test
	public void whenBasesEarned0_1ExpectedBattingAverageIs_500() {
		Batter b = new Batter();
		double d = b.calculateBatAverage(2, 1);
	Assert.assertEquals(.500, d, 0.00);
	
	} 
public void when
}
