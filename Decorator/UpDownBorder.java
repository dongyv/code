package Decorator;

public class UpDownBorder extends Border{
	private char borderChar;
	
	public UpDownBorder(Display display,char borderChar) {
		// TODO Auto-generated constructor stub
		super(display);
		this.borderChar = borderChar;
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns();
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1+display.getRows()+1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row == 0){//�±߿�
			return makeLine(borderChar,display.getColumns()) ;
		}else if(row == display.getRows() +1){//�ϱ߿�
			return makeLine(borderChar,display.getColumns());
		}else{//�����߿�
			return display.getRowText(row-1);
		}
	}
	
	private String makeLine(char ch,int count){//����һ���ظ��������Ĵ��ַ�ch���ַ���
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<count;i++){
			buf.append(ch);
		}
		return buf.toString();
	}
}
