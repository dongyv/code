package Build;

/**
 * 用来构建Builder的子类
 * 
 * 但是没有具体的实现类
 * @author Administrator
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(){
		builder.makeTitle("标题");
		builder.makeString("早上下午");
		builder.makeItem(new String[]{//条目
				"早上好!","下午好！"
		});
		builder.makeString("晚上");
		builder.makeItem(new String[]{//条目
				"晚上好!","晚安！","再见"
		});
		builder.close();
	}
}
