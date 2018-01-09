package Composite;

public class Main {
	public static void main(String[] args){
		System.out.println("创建目录 ...");
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory userdir = new Directory("user");
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(userdir);
		bindir.add(new File("vi",10000));
		bindir.add(new File("latex",20000));
		rootdir.printList();
		
		System.out.println("");
		System.out.println("目录文件创建中 ...");
		Directory yuki = new Directory("yuki");
		Directory banako = new Directory("banako");
		Directory tomura = new Directory("tomura");
		userdir.add(yuki);
		userdir.add(banako);
		userdir.add(tomura);
		yuki.add(new File("diary.html",100));
		yuki.add(new File("Composite.java",200));
		banako.add(new File("memo.text",300));
		tomura.add(new File("game.doc",400));
		tomura.add(new File("junk.mail",500));
		rootdir.printList();
	}
}
