package design.prototyDemo;
/*
 * ���ÿһ����ʽ����дһ���࣬��ô��������ͻ��Ӵ�
 * 
 * ʵ������ͨ��get�������л�ȡ�ģ���û��ʹ�����������ַ�ʽ���и��õ�ͨ����
 * 
 * prototypeģʽ ���ǿ�������һ���뵱ǰʵ����״̬��ȫ��ͬ��ʵ��
 */
public interface Product extends Cloneable{
	public abstract void use(String s);//ʵ����ʹ�÷���
	public abstract Product createClone();//���ɸ�������
}
