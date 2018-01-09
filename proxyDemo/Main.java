package design.proxyDemo;

public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("dongyv");
		System.out.println("现在打印的是："+p.getPrinterName());
		p.setPrinterName("xia");
		System.out.println("现在打印的是："+p.getPrinterName());
		p.print("xiadongyv");
	}
}
