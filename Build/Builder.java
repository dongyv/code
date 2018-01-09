package Build;

/**
 * builer 模式
 * 
 * 这个模板类确定的各个子类的需求
 * 且有一个模板的使用类，用来排好模板、、
 * 
 * 俩个子类实现类，则是根据需求往模板中 修改
 */
public abstract class Builder {
	
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItem(String[] items);
	public abstract void close();
}
