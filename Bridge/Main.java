package Bridge;
/**
 * ����ģʽ
 * �ŵ����ˡ�һ����������ʾ�ģ�һ��������ʵ�ֵġ�
 * ��ʾ����Ҫ�������Ǵ���ʵ�ֵ���ĳ��࣬����ʱ�� �Ϳ��԰�ʵ����Ĵ�������
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
