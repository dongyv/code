package Stategy;
/**
 * ����ģʽ
 * ��Ҫ���滻�㷨�Ĳ��ֵ�
 * @author Administrator
 * 
 * ���Խӿ�
 */
public interface strategy {
	public abstract Hand nexthand();
	public abstract void study(boolean win);
}
