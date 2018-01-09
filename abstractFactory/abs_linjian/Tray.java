package abstractFactory.abs_linjian;

import java.util.ArrayList;

/**
 * 有个添加抽闲零件 父类的方法
 * @author Administrator
 *
 */
public abstract class Tray extends Item{
		
	protected ArrayList tray = new ArrayList();
	public Tray(String caption){
		super(caption);
	}
	
	public void add(Item item){
		tray.add(item);
	}
}
