package Stategy;

//需要传 姓名和策略(strategy)中的实现类
//主要是 选择策略
public class player {
	private String name;
	private strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;

	public player(String name, strategy strategy) {//strategy 是关于运算的算法类
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() {
		return strategy.nexthand();
	}

	public void win() { // 胜
		strategy.study(true);
		wincount++;
		gamecount++;

	}

	public void lose() { // 负
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void even() { // 平
		gamecount++;
	}

	public String toString() {
		return "[" + name + ":" + gamecount + " game," + wincount + " win, " + losecount + "lose " + "]";
	}
}
