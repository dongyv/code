package Composite;

public abstract class Entry {
	public abstract String getName();//获得名字
	public abstract int getSize();//获得大小
	public Entry add(Entry entry) throws FileTreatmentException{//加入目录条目
		throw new FileTreatmentException();
	}
	public void printList(){
		printList("");
	}
	
	protected abstract void printList(String prefix);//为一览加上前缀并显示目录条目一览
	public String toString(){
		return getName() +"("+getSize()+")";
	}
}
