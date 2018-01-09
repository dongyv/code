package abstractFactory.abs_linjian;
/**
 * ³éÏóÁã¼ş
 * @author Administrator
 *
 */
public abstract class Item {
	protected String caption;
	
	public Item(String caption){
		this.caption = caption;
	}
	
	public abstract String makeHTML();
}
