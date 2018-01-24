package Iterator;

public class Main {
	public static void main(String[] args){
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("大型网站分布式架构"));
		bookShelf.appendBook(new Book("分布式网站与中间件"));
		bookShelf.appendBook(new Book("架构探险"));
		bookShelf.appendBook(new Book("spring内幕"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
