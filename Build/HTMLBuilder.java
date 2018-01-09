package Build;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * builder 的具体实现的方法之一
 * 额外的添加俩个属性
 * @author Administrator
 *
 */
public class HTMLBuilder extends Builder{
	private String fileName;
	private PrintWriter writer;
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		fileName = title +".html";
		//生成printWriter
		try {
			writer = new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("<html><head><title>"+title+"</title></head><body>");
		//输出标题
		writer.println("<h1>"+title+"</h1>");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		writer.println("<p>"+str+"</p>");
		
	}

	@Override
	public void makeItem(String[] items) {
		// TODO Auto-generated method stub
		writer.println("<ul>");
		for(int i=0;i<items.length;i++){
			writer.println("<li>"+items[i]+"</li>");
		}
		writer.println("</ul>");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		writer.println("</body></html>");
		writer.close();
	}
	
	public String getResult(){
		return fileName;//文件名
	}
}
