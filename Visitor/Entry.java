package Visitor;

public abstract class Entry implements Element{
	public abstract String getName();//�������
	public abstract int getSize();//��ô�С
	public Entry add(Entry entry) throws FileTreatmentException{//����Ŀ¼��Ŀ
		throw new FileTreatmentException();
	}
	
	public String toString(){
		return getName() +"("+getSize()+")";
	}
}
