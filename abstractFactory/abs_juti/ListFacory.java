package abstractFactory.abs_juti;

import abstractFactory.abs_linjian.Factory;
import abstractFactory.abs_linjian.Link;
import abstractFactory.abs_linjian.Page;
import abstractFactory.abs_linjian.Tray;

/**
 * 具体的工厂实现
 * @author Administrator
 *
 */
public class ListFacory extends Factory{
	public Link createLink(String caption,String url){
		return new ListLink(caption,url);
	}
	
	public Tray createTray(String caption){
		return new ListTray(caption);
	}
	
	public Page createPage(String title,String author){
		return new ListPage(title,author);
	}
	
}
