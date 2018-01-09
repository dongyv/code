package Bridge;

public class StringDisplayImpl extends DisplayImpl{
	private String string;//要显示的字符串
	private int width;//字节数储存 计算出的宽度
	public StringDisplayImpl(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
		this.width =string.getBytes().length;
	}
	
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println("|"+string+"|");
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		printLine();
	}
	private void printLine(){
		System.out.print("+");
		for(int i=0;i<width;i++){
			System.out.print("-");
		}
		System.out.println("+");
	}
}
