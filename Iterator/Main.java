package Iterator;

public class Main {
	public static void main(String[] args){
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("������վ�ֲ�ʽ�ܹ�"));
		bookShelf.appendBook(new Book("�ֲ�ʽ��վ���м��"));
		bookShelf.appendBook(new Book("�ܹ�̽��"));
		bookShelf.appendBook(new Book("spring��Ļ"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
