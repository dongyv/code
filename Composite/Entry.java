package Composite;

public abstract class Entry {
	public abstract String getName();//�������
	public abstract int getSize();//��ô�С
	public Entry add(Entry entry) throws FileTreatmentException{//����Ŀ¼��Ŀ
		throw new FileTreatmentException();
	}
	public void printList(){
		printList("");
	}
	
	protected abstract void printList(String prefix);//Ϊһ������ǰ׺����ʾĿ¼��Ŀһ��
	public String toString(){
		return getName() +"("+getSize()+")";
	}
}
