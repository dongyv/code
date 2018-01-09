package Stategy;

import java.util.Random;

//²ÂÈ­µÄ²ßÂÔ `1`
public class winningStrategy implements strategy{
	private Random random;
	private boolean won = false;
	private Hand preHand;
	
	public winningStrategy(int seed) {
		// TODO Auto-generated constructor stub
		random = new Random(seed);
	}
	@Override
	public Hand nexthand() {
		// TODO Auto-generated method stub
		if(!won){
			preHand = Hand.getHand(random.nextInt(3));
		}
		return preHand;
	}

	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		won = win;
	}

}
