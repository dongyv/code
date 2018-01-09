package Bridge;

public class Display {
	private DisplayImpl impl;

	public Display(DisplayImpl impl){//注入类，注入的是Display的实现类StringDisplayImpl
		this.impl = impl;
	}
	
	public void open(){
		impl.rawOpen();
	}
	public void print(){
		impl.rawPrint();
	}
	public void close(){
		impl.rawClose();
	}
	
	public void display(){
		open();
		print();
		close();
	}
}
