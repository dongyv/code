package Decorator;

public class Main {

	public static void main(String[] args) {
		MultiStringDisplay mu = new MultiStringDisplay();
		mu.add("早上好");
		mu.add("中午好啊");
		mu.add("晚上好啊!你好");
		mu.show();
		Display bmu = new SideBorder(mu,'#');
		bmu.show();
		
		Display b1 = new StringDisplay("Hello,world.");
		Display b2 = new SideBorder(b1,'#');
		Display b3 = new FullBorder(b2);
		Display b51 = new UpDownBorder(b1,'-');
		Display b52 = new UpDownBorder(b51,'+');
		
//		b51.show();
//		b52.show();
//		b1.show();
//		b2.show();
//		b3.show();
		Display b4 = new SideBorder(
				new FullBorder(
						new FullBorder(
								new SideBorder(
										new FullBorder(
												new StringDisplay("你好,世界.")), '*'))), '/');
//		b4.show();
	}

}
