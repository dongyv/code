package Build;

/**
 * builer ģʽ
 * 
 * ���ģ����ȷ���ĸ������������
 * ����һ��ģ���ʹ���࣬�����ź�ģ�塢��
 * 
 * ��������ʵ���࣬���Ǹ���������ģ���� �޸�
 */
public abstract class Builder {
	
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItem(String[] items);
	public abstract void close();
}
