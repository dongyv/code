package Stategy;
/**
 * 策略模式
 * 主要是替换算法的部分的
 * @author Administrator
 * 
 * 策略接口
 */
public interface strategy {
	public abstract Hand nexthand();
	public abstract void study(boolean win);
}
