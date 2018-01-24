package design.proxyDemo;

public class PrinterProxy implements Printable{
	private String name;//����
	private Printer real;//����
	private Printable printable;
	public PrinterProxy() {
		
	}
	
	public PrinterProxy(Printable printable) {
		this.printable = printable;
	}
	
	public PrinterProxy(String name) {
		this.name = name;
	}
	@Override
	public synchronized void setPrinterName(String name) {
		// TODO Auto-generated method stub
		if(real != null) {
			real.setPrinterName(name);//���ñ�������
		}
		this.name = name;
	}

	@Override
	public  String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
//		realize();
		printable.print(string);//��������ˣ����˵Ĵ�ӡ����
	}
	
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}
}
