package Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList observers = new ArrayList<>();//�����Observer��
	public void addObserver(Observer observer){//ע��Observer
		observers.add(observer);
	}
	public void deleteObserver(Observer observer){//ɾ��Observer
		observers.remove(observer);
	}
	public void notifyObservers(){//��Observer����֪ͨ
		Iterator it = observers.iterator();
		while(it.hasNext()){
			Observer o = (Observer)it.next();
			o.update(this);
		}
	}
	
	public abstract int getNumber();//��ȡ��ֵ
	public abstract void execute();//������ֵ
	
}