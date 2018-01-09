package Bridge;
/**
 * 侨联模式
 * 桥的俩端。一个是用来显示的，一个是用来实现的。
 * 显示的主要方法就是传入实现的类的超类，接入时候 就可以吧实现类的传进来。
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display(new StringDisplayImpl("hello,xia"));
		Display d2 = new CountDisplay(new StringDisplayImpl("hello,dong"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,yu"));
		d1.display();
		d2.display();
		d3.display();
		d3.multDisplay(5);
	}

}
