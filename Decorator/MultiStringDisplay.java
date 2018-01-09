package Decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{
	private List<String> mulit ;
	
	public MultiStringDisplay() {
		// TODO Auto-generated constructor stub
		mulit = new ArrayList<>();
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return mulit.size();
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row>=0){
			return mulit.get(row);
		}
		return null;
	}
	public void add(String sb){
		mulit.add(sb);
	}
}
