package Decorator;

public class StringDisplay extends Display{//用于显示单个字符串
	private String string;//要显示的字符串
	public StringDisplay(String string){//通过参数传入要显示的字符串
		this.string = string;
	}
	@Override
	public int getColumns() {
		return string.getBytes().length;//字符数
	}
	@Override
	public int getRows() {
		return 1;//行数是1
	}
	@Override
	public String getRowText(int row) {//只有当row为0时，返回值
		if(row ==0)
			return string;
		else 
			return null;
	}
}
