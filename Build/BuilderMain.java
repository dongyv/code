package Build;

public class BuilderMain {
	public static void main(String args[]){
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		if(args.length!=1){
//			usage();
//			System.exit(0);
//		}
			TextBuilder textBuilder = new TextBuilder();
			Director dir = new Director(textBuilder);
			dir.construct();
			String result = textBuilder.getResult();
			System.out.println("plain:"+result);
			System.out.println("------------------------------------分界线----------------------------------------------------");
			System.out.println("------------------------------------分界线----------------------------------------------------");
			System.out.println("------------------------------------分界线----------------------------------------------------");
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director dir1 = new Director(htmlBuilder);
			dir1.construct();
			String fileName = htmlBuilder.getResult();//文件名
			System.out.println(fileName+"文件编写完成");
	}
	
	public static void usage(){
		System.out.println("usage java Main plain 编写纯文档");
		System.out.println("usage java Main html  编写纯html");
	}
}
