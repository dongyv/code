package Decorator;

public abstract class Display {
	public abstract int getColumns();//获取横向字符数
	public abstract int getRows();//获取纵向字符数
	public abstract String getRowText(int row);//获取第row行的字符串
//	int[] Coulumns = new int[getColumns()];
	
	public final void show(){
		for(int i=0;i<getRows();i++){
			System.out.println(getRowText(i));
		}
	}
}
