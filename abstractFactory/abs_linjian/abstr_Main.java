package abstractFactory.abs_linjian;

import abstractFactory.abs_juti.ListFacory;

//讲工厂的零件组装成工厂
public class abstr_Main {
	public static void main(String args[]){
//		System.out.println(ListFacory.class);
		Factory factory = Factory.getFactory("abstractFactory.abs_juti.ListFacory");
		
		Link peaple = factory.createLink("人民日报","htp://www.baidu.com");
		Link gmw = factory.createLink("光明日报", "http://www.google.com");
		Link us_yahho = factory.createLink("Yahho!","htp://www.yahho.com");
		Link jp_yahho = factory.createLink("Yhoo!Japan", "http://www.yahoo.co.jp");

		Tray tranynew = factory.createTray("日报");
		tranynew.add(peaple);
		tranynew.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahho);
		trayyahoo.add(jp_yahho);
		
		Page page = factory.createPage("LinkPage", "杨文轩");
		page.add(tranynew);
		page.add(trayyahoo);
		
		page.output();
		
	}
}
