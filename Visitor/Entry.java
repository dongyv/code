package Visitor;

public abstract class Entry implements Element{
	public abstract String getName();//获得名字
	public abstract int getSize();//获得大小
	public Entry add(Entry entry) throws FileTreatmentException{//加入目录条目
		throw new FileTreatmentException();
	}
	
	public String toString(){
		return getName() +"("+getSize()+")";
	}
}
