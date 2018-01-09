package design.prototyDemo;
//首先生成Manager实例，然后在Manager实例中注册UnderlinePen和MessageBox实例
public class Main {
	public static void main(String[] args) {
		//准备
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);//将对象和键id注册到manager中管理
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		//生成
		Product p1 = manager.create("strong message");//通过对应的key进行创建子类
		p1.use("1:Hello,word.");//实现子类的调用
		Product p2 = manager.create("warning box");
		p2.use("2:Hello,word.");
		Product p3 = manager.create("slash box");
		p3.use("3:Hello,word.");
	}
}
