package Decorator;

public abstract class Border extends Display{
	protected Display display;//��ʾ��װ����
	protected Border(Display display) {
		this.display = display;//������ʵ��ʱͨ������ָ����װ����
	}
}
