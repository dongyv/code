package Decorator;

public abstract class Display {
	public abstract int getColumns();//��ȡ�����ַ���
	public abstract int getRows();//��ȡ�����ַ���
	public abstract String getRowText(int row);//��ȡ��row�е��ַ���
//	int[] Coulumns = new int[getColumns()];
	
	public final void show(){
		for(int i=0;i<getRows();i++){
			System.out.println(getRowText(i));
		}
	}
}
