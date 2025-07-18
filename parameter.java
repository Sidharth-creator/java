class Student {
	String name;
	int rollnumber;
	String department;
	Student(String name,int rollnumber,String department){
		this.name=name;
		this.rollnumber=rollnumber;
		this.department=department;
	}
	public void hai() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollnumber);
		System.out.println("Department: " + department);
	}
	
}
public class ConstructorPara{
	public static void main(String[] args){
		Student student=new Student("sidharth",65,"cse");
		student.hai();
	}
}
