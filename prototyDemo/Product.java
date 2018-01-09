package design.prototyDemo;
/*
 * 如果每一个样式都编写一个类，那么类的数量就会庞大
 * 
 * 实例，是通过get方法进行获取的，并没有使用类名，这种方式具有更好的通用性
 * 
 * prototype模式 就是可以生成一个与当前实例的状态完全相同的实例
 */
public interface Product extends Cloneable{
	public abstract void use(String s);//实例的使用方法
	public abstract Product createClone();//生成副本方法
}
