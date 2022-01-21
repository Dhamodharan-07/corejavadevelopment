package Basicsprogram;

import java.util.Scanner;

public class Sumoftwodigit {
public static void main(String args[])
{
	int num1,num2,result;
	Scanner input=new Scanner(System.in);
	
System.out.println("Enter 1st digit:");
num1=input.nextInt(); //2

System.out.println("Enter 2nd digit:");
num2=input.nextInt();//5

result=num1+num2;//2+5=5 result=5
System.out.println("The sum is:"  +result);


	

}
}
