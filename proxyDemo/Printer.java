package design.proxyDemo;

public class Printer implements Printable{
	private String name;
	public Printer() {
		heavyJob("��������Printer��ʵ��");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("��������Printer��ʵ��("+name+")");
	}
	
	public void print(String string) {
		System.out.println("=== "+name + "=== ");
		System.out.println(string);
	}
	
	private void heavyJob(String msg) {
		System.out.println(msg);
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("����.");
	}

	@Override
	public void setPrinterName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}
}
