package Decorator;

public class FullBorder extends Border{
	public FullBorder(Display display){
		super(display);
	}

	@Override
	public int getColumns() {//�ַ���Ϊ��װ������ַ�����������߿��ַ���
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {//����Ϊ��װ����������������±߿������
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {//ָ������һ���ַ���
		if(row == 0){//�±߿�
			return "+" + makeLine('-',display.getColumns()) + "+";
		}else if(row == display.getRows() +1){//�ϱ߿�
			return "+" + makeLine('-',display.getColumns()) + "+";
		}else{//�����߿�
			return "|" + display.getRowText(row-1) +"|";
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
