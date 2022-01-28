/*typecating*/
package corejavaproject;
import java.util.Scanner;

public class typecastingExample {

	public static void main(String[] args) {
		float a;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value");//type conversation
        a=sc.nextFloat();
		System.out.println("value:"+ a);
	
		a=sc.nextFloat();
	
	}
	

	{
		int a;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value");
		a=sc.nextInt();
		System.out.println("value:"+ a);
		
		
	}
	
	{
	
		double a=45.78;
//narrowing type casting
long p=(long)a;
System.out.println("value: "+p);
	

//widering typecasting
int b=45;
double d=b;
System.out.println("value:"+d);
}
}
