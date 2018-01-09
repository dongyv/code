package design.prototyDemo;
//��������Managerʵ����Ȼ����Managerʵ����ע��UnderlinePen��MessageBoxʵ��
public class Main {
	public static void main(String[] args) {
		//׼��
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);//������ͼ�idע�ᵽmanager�й���
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		//����
		Product p1 = manager.create("strong message");//ͨ����Ӧ��key���д�������
		p1.use("1:Hello,word.");//ʵ������ĵ���
		Product p2 = manager.create("warning box");
		p2.use("2:Hello,word.");
		Product p3 = manager.create("slash box");
		p3.use("3:Hello,word.");
	}
}
