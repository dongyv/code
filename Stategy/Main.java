package Stategy;

public class Main {
	public static void main(String args[]){
		player play1 = new player("Taro",new winningStrategy(3));
		player play2 = new player("Hana",new probStrategry(3));
		
		for(int i=0;i<1000;i++){
			Hand nextHand1 = play1.nextHand();
			Hand nextHand2 = play2.nextHand();
			System.out.println(nextHand1+"::"+nextHand2);
			if(nextHand1.isStrongThan(nextHand2)){
				System.out.println("winner: "+play1);
				play1.win();
				play2.lose();
			}else if(nextHand2.isStrongThan(nextHand2)){
				System.out.println("winner: "+play2);
				play1.lose();
				play2.win();
				
			}else{
				System.out.println("Even ...");
				play1.even();
				play2.even();
				
			}
			System.out.println("Total result: ");
			System.out.println(play1.toString());
			System.out.println(play2.toString());
		}
	}
}
