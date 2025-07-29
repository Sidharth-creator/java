class Student{
	String name;
	static int StudentCount=0;
	Student(String name){
		this.name=name;
		StudentCount++;
	}
	public void printDetails() {
		System.out.println(name);
		System.out.println(StudentCount);
	}
}
public class Staticdemo{
	public static void main(String[] args) {
		Student student =new Student("test");
		student.printDetails();
	}
	
}
