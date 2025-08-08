class Book {
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
    }
	public void displayDetails() {
		System.out.println("Title"+title);
		System.out.println("author"+author);
		System.out.println("price"+price);
	}
}
class Ebook extends Book{
	double fileSize;
	Ebook(String title,String author,double price,double fileSize){
		super(title,author,price);
		this.fileSize=fileSize;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("fileSize"+fileSize);
}
class printedBook extends Book{
	int numberOfPages;
	printedBook(String title,String author,double price,int numberOfPages){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("numberOfPages"+numberOfPages);
	
	
}
public class main{
	public static void(String[] args) {
		Ebook ebook=new Ebook("java","none",333.3,23.3);
		ebook.displayDetails();
		System.out.println();
		printedBook pbook=new printedBook("hai","none",23.4,50);
		pbook.displayDetails();
		
		
	}
		
	
}
