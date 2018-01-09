package Decorator;

public class SideBorder extends Border{// |装饰物|
	private char borderChar;//表示装饰边框的字符
	public SideBorder(Display display,char ch){
		//通过构造函数指定Display和装饰边框字符										
		super(display);
		this.borderChar = ch;
	}
	@Override
	public int getColumns() {//字符数为字符串字符加上俩侧边框字符数
		return 1 + display.getColumns() + 1;
	}
	@Override
	public int getRows() {//行数 即被装饰物的行数
		return display.getRows();
	}
	@Override
	public String getRowText(int row) {//指定的那一行的字符数为被装饰物的字符串
		return borderChar + display.getRowText(row) + borderChar;//加上俩侧的边框的字符
	}
	
}
