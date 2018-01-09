package Stategy;
/**
 * ���x�˱���Ҏ�t
 * @author Administrator
 *
 */
public class Hand {
	public static final int HANDVALUE_GUU = 0;//ʯͷ
	public static final int HANDVALUE_CHO = 1;//����
	public static final int HANDVALUE_PAA = 2;//��
	public static final Hand[] hand = {//�²��е�3��ʵ��
		new Hand(HANDVALUE_GUU),
		new Hand(HANDVALUE_CHO),
		new Hand(HANDVALUE_PAA),
	};
	private static final String[] name = {//�²��������ַ���
		"ʯͷ","����","��",
	};
	
	private int handvalue;//��ȭ�����Ƶ�ֵ
	private Hand(int handvalue){
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue){//�������ƻ�ö�Ӧ��ʵ��
		return hand[handvalue];
	}
	
	public boolean isStrongThan(Hand h){//���thisʤ�� h����true
		return fight(h) == 1;
	}
	
	public boolean isWeakerThan(Hand h){//���this�� h����true
		return fight(h) == -1;
	}
	
	private int fight(Hand h){//�Ʒ� ƽ 0��ʤ 1���� -1
		if(this == h){
			return 0;
		}else if((this.handvalue+1 ) % 3 == h.handvalue){
			return 1;
		}else{
			return -1;
		}
	}
	
	public String toString(){//ת������ֵ���ַ���
		return name[handvalue];
	}
}
