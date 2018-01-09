package Stategy;
/**
 * 定義了比赛規則
 * @author Administrator
 *
 */
public class Hand {
	public static final int HANDVALUE_GUU = 0;//石头
	public static final int HANDVALUE_CHO = 1;//剪刀
	public static final int HANDVALUE_PAA = 2;//布
	public static final Hand[] hand = {//猜测中的3种实例
		new Hand(HANDVALUE_GUU),
		new Hand(HANDVALUE_CHO),
		new Hand(HANDVALUE_PAA),
	};
	private static final String[] name = {//猜测手势中字符串
		"石头","剪刀","布",
	};
	
	private int handvalue;//猜拳中手势的值
	private Hand(int handvalue){
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue){//根据手势获得对应的实例
		return hand[handvalue];
	}
	
	public boolean isStrongThan(Hand h){//如果this胜利 h返回true
		return fight(h) == 1;
	}
	
	public boolean isWeakerThan(Hand h){//如果this输 h返回true
		return fight(h) == -1;
	}
	
	private int fight(Hand h){//计分 平 0，胜 1，负 -1
		if(this == h){
			return 0;
		}else if((this.handvalue+1 ) % 3 == h.handvalue){
			return 1;
		}else{
			return -1;
		}
	}
	
	public String toString(){//转换手势值的字符串
		return name[handvalue];
	}
}
