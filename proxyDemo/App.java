package design.proxyDemo;

public class App {
	 public static void main(String[] args) {
	        // Ŀ�����
	        Printable target = new Printer();
	        // ��ԭʼ������ class cn.itcast.b_dynamic.UserDao��
	        System.out.println(target.getClass());

	        // ��Ŀ����󣬴����������
	        Printable proxy = (Printable) new ProxyFactory(target).getProxyInstance();
	        // class $Proxy0   �ڴ��ж�̬���ɵĴ������
	        System.out.println(proxy.getClass());

	        // ִ�з���   ���������
	        proxy.print("dongyu");
	    }
}