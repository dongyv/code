package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
	private String name;//文件夹名字
	private ArrayList<Object> directory =new ArrayList<>();//文件夹中目录条目的集合
	
	public Directory(String name){
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {//获取大小 通过迭代器
		int size = 0;
		Iterator<Object> it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	
	public Entry add(Entry entry){//增加目录条目
		directory.add(entry);
		return this;
	}
	
	@Override
	protected void printList(String prefix) {//增加目录条目一览
		System.out.println(prefix +"/"+ this);
		Iterator<Object> it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.printList(prefix+"/"+ name);
		}
	}

}
