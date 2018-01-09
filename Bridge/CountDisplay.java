package Bridge;
/**
 * 显示规定次数
 * @author Administrator
 *
 */
public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl Impl){
		super(Impl);
	}
	
	public void multDisplay(int time){//循环time次
		open();
		for(int i = 0;i<time;i++){
			print();
		}
		close();
	}
}
