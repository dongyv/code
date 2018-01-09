package Stategy;

//��Ҫ�� �����Ͳ���(strategy)�е�ʵ����
//��Ҫ�� ѡ�����
public class player {
	private String name;
	private strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;

	public player(String name, strategy strategy) {//strategy �ǹ���������㷨��
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() {
		return strategy.nexthand();
	}

	public void win() { // ʤ
		strategy.study(true);
		wincount++;
		gamecount++;

	}

	public void lose() { // ��
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void even() { // ƽ
		gamecount++;
	}

	public String toString() {
		return "[" + name + ":" + gamecount + " game," + wincount + " win, " + losecount + "lose " + "]";
	}
}
