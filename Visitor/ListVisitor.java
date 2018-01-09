package Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor{
	private String currentdir = "";//��ǰ���ʵ��ļ��е�����
	@Override
	public void visit(File file) {//�ڷ����ļ�ʱ����
		System.out.println(currentdir +"/"+ file);
	}

	@Override
	public void visit(Directory directory) {//�ڷ����ļ���ʱ����
		System.out.println(currentdir +"/"+ directory);
		String savedir = currentdir;
		currentdir = currentdir +"/"+ directory.getName();
		Iterator it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
