package Bridge;
/**
 * ��ʾ�涨����
 * @author Administrator
 *
 */
public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl Impl){
		super(Impl);
	}
	
	public void multDisplay(int time){//ѭ��time��
		open();
		for(int i = 0;i<time;i++){
			print();
		}
		close();
	}
}
