package Build;
/**
 * builder 的具体实现的方法之一
 * @author Administrator
 *
 */
public class TextBuilder extends Builder{

	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		buffer.append("=================\n");
		buffer.append("["+title+"]\n");
		buffer.append("\n");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		buffer.append("(●￣(ｴ)￣●)"+str+"\n");
		buffer.append("\n");
	}

	@Override
	public void makeItem(String[] items) {
		// TODO Auto-generated method stub
		for(int i=0;i<items.length;i++){
			buffer.append(" ."+items[i]+"\n");
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		buffer.append("==========================================\n");
	}
	
	public String getResult(){
		return buffer.toString();
	}
}
