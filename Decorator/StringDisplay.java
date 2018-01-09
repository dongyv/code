package Decorator;

public class StringDisplay extends Display{//������ʾ�����ַ���
	private String string;//Ҫ��ʾ���ַ���
	public StringDisplay(String string){//ͨ����������Ҫ��ʾ���ַ���
		this.string = string;
	}
	@Override
	public int getColumns() {
		return string.getBytes().length;//�ַ���
	}
	@Override
	public int getRows() {
		return 1;//������1
	}
	@Override
	public String getRowText(int row) {//ֻ�е�rowΪ0ʱ������ֵ
		if(row ==0)
			return string;
		else 
			return null;
	}
}
