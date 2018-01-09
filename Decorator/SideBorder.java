package Decorator;

public class SideBorder extends Border{// |װ����|
	private char borderChar;//��ʾװ�α߿���ַ�
	public SideBorder(Display display,char ch){
		//ͨ�����캯��ָ��Display��װ�α߿��ַ�										
		super(display);
		this.borderChar = ch;
	}
	@Override
	public int getColumns() {//�ַ���Ϊ�ַ����ַ���������߿��ַ���
		return 1 + display.getColumns() + 1;
	}
	@Override
	public int getRows() {//���� ����װ���������
		return display.getRows();
	}
	@Override
	public String getRowText(int row) {//ָ������һ�е��ַ���Ϊ��װ������ַ���
		return borderChar + display.getRowText(row) + borderChar;//��������ı߿���ַ�
	}
	
}
