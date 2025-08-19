package hai;

import java.util.Scanner;

public class StaticMethodDemo {
	   int i;
	   Scanner sc  =new Scanner(System.in);
	   System.out.println("enter the value of n");
	   int n=sc.nextInt();
	   int [] array=new int[n];
	   System.out.println("enter the element");
	   for(i=0;i<n;i++){
		   array[i]=sc.nextInt();
	   }
	   int largest=array[0];
	   for(i=0;i<n;i++) {
		   if(array[i]>largest){
			   largest=array[i];
		   }
	   }
	   System.out.println("the largest element is"+largest);
	   
	   
	   
       
}
