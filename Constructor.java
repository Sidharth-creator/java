class Book{
     String title;
	 String author;
	 double price;
	 Book(){
		 title="unknown";
		 author="Not assigned";
		 price=0.0;
	 }
	 public void displayDetails() {
		 System.out.println("Title;\t"+title);
		 System.out.println("Author;\t"+author);	
		 System.out.println("Price;\t"+price);
	 }
		 
}
public class ConstructorDemo1{
	public static void main(String[] args) {
		Book book=new Book();
		book.displayDetails();
	}
		
		
		 

}
	 
