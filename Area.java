/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Author      : Sidharth.S
 ★ Date        : 2025-07-21
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
class AreaCalculator{
	public void area(double r) {
		double area=3.14f*r*r;
		System.out.println("Circle area="+area);
	}
	public void area(double a,double b) {
		double area=a*b;
		System.out.println("Reactangle area="+area);
	}
	public void area(float b,float h) {
		float area=0.5f*b*h;
		System.out.println("Triangle area="+area);
	}
	public void area(int a) {
		int area=a*a;
		System.out.println("Square area="+area);
	}
}
public class area{
	public static void main(String[] args) {
		AreaCalculator arle=new AreaCalculator();
		arle.area(2.1);
		arle.area(2.1,2.1);
		arle.area(3.2,3.2);
		arle.area(2);
		
	}
}
