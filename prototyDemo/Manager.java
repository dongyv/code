package design.prototyDemo;

import java.util.HashMap;

public class Manager {
	private HashMap<Object, Object> showcase = new HashMap<>();
	public void register(String name,Product poto) {//ע�����
		showcase.put(name, poto);
	}
	public Product create(String potoname) {
		Product p = (Product)showcase.get(potoname);
		
		return p.createClone();//���� ��Ӧ���� �����ʵ��
	}
}
