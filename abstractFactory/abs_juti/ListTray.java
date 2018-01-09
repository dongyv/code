package abstractFactory.abs_juti;

import java.util.Iterator;

import abstractFactory.abs_linjian.Item;
import abstractFactory.abs_linjian.Tray;

public class ListTray extends Tray{
	public ListTray(String caption){
		super(caption);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer();
		sb.append("<li>\n");
		sb.append(caption + "\n");
		sb.append("<ul>\n");
		Iterator it = tray.iterator();
		while(it.hasNext()){
			Item item =(Item)it.next();
			sb.append(item.makeHTML());
		}
		
		sb.append("</ul>\n");
		sb.append("</li>\n");
		
		return sb.toString();
	}
}
