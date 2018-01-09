package abstractFactory.abs_linjian;

import abstractFactory.abs_juti.ListFacory;

//�������������װ�ɹ���
public class abstr_Main {
	public static void main(String args[]){
//		System.out.println(ListFacory.class);
		Factory factory = Factory.getFactory("abstractFactory.abs_juti.ListFacory");
		
		Link peaple = factory.createLink("�����ձ�","htp://www.baidu.com");
		Link gmw = factory.createLink("�����ձ�", "http://www.google.com");
		Link us_yahho = factory.createLink("Yahho!","htp://www.yahho.com");
		Link jp_yahho = factory.createLink("Yhoo!Japan", "http://www.yahoo.co.jp");

		Tray tranynew = factory.createTray("�ձ�");
		tranynew.add(peaple);
		tranynew.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahho);
		trayyahoo.add(jp_yahho);
		
		Page page = factory.createPage("LinkPage", "������");
		page.add(tranynew);
		page.add(trayyahoo);
		
		page.output();
		
	}
}
