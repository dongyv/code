package Build;

/**
 * ��������Builder������
 * 
 * ����û�о����ʵ����
 * @author Administrator
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(){
		builder.makeTitle("����");
		builder.makeString("��������");
		builder.makeItem(new String[]{//��Ŀ
				"���Ϻ�!","����ã�"
		});
		builder.makeString("����");
		builder.makeItem(new String[]{//��Ŀ
				"���Ϻ�!","����","�ټ�"
		});
		builder.close();
	}
}
