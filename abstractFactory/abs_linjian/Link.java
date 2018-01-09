package abstractFactory.abs_linjian;
/**
 * ³éÏóÁã¼ş
 * @author Administrator
 *
 */
public abstract class Link extends Item{
	protected String url;
	public Link(String caption,String url){
		super(caption);
		this.url = url;
	}
}
