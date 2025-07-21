/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Author      : Sidharth.S
 ★ Date        : 2025-07-21
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/

class Calculator{
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("SUM of"+a+b+"="+sum);
	}
	public void add(int c,int d,int e ) {
		int sum=c+d+e;
		System.out.println("SUM of"+c+d+e+"="+sum);
	}
	public void add(double d,double e ) {
		double sum=d+e;
		System.out.println("SUM of"+d+e+"="+sum);
	}
	public void add(String c,int d) {
		String sum=c+d;
		System.out.println("SUM of"+c+d+"="+sum);
	}
}
public class Check{
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(2,3);
		calc.add(2,3,4);
		calc.add(2.3,2.3);
		calc.add("hai",2);
		
			
		
	}
}
