package Visitor;

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
	
	public Iterator iterator(){
		return directory.iterator();
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);//观察当前的文件夹
	}

}
