package design.proxyDemo;

public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("dongyv");
		System.out.println("���ڴ�ӡ���ǣ�"+p.getPrinterName());
		p.setPrinterName("xia");
		System.out.println("���ڴ�ӡ���ǣ�"+p.getPrinterName());
		p.print("xiadongyv");
	}
}
