package abstractFactory.abs_linjian;

import java.util.ArrayList;

/**
 * �и���ӳ������ ����ķ���
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
