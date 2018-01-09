package abstractFactory.abs_juti;

import java.util.Iterator;

import abstractFactory.abs_linjian.Item;
import abstractFactory.abs_linjian.Page;

public class ListPage extends Page{
	public ListPage(String title,String author){
		super(title,author);
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>"+title+"</title></head>");
		sb.append("<body>\n");
		sb.append("h1>"+title+"</h1>\n");
		sb.append("<ul>\n");
		Iterator it = content.iterator();
		while(it.hasNext()){
			Item item = (Item)it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>"+author+"</hr></address>");
		sb.append("</body></html>\n");
		
		return sb.toString();
	}

}
