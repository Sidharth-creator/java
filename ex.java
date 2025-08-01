package SId;

class Book {
	String title;
	String author;
	final int bookID=1232;
	static int bookcounter=1000;
	static final String Library_Name="central library";
	Book(){
		title="nil";
		author="nil";
		bookID=bookcounter;
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		bookcounter++;
		
	}
	

}
