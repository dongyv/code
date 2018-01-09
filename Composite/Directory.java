package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
	private String name;//�ļ�������
	private ArrayList<Object> directory =new ArrayList<>();//�ļ�����Ŀ¼��Ŀ�ļ���
	
	public Directory(String name){
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {//��ȡ��С ͨ��������
		int size = 0;
		Iterator<Object> it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	
	public Entry add(Entry entry){//����Ŀ¼��Ŀ
		directory.add(entry);
		return this;
	}
	
	@Override
	protected void printList(String prefix) {//����Ŀ¼��Ŀһ��
		System.out.println(prefix +"/"+ this);
		Iterator<Object> it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.printList(prefix+"/"+ name);
		}
	}

}
