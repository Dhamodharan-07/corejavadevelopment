package corejavaproject;

import java.util.Scanner;

//encapsulation
class human
{

//class properties or variable
	//by using access specified-default(by default),public,protected
	public float height;
	public float weight;

public void setheightandweight(float h,float w)//h=5.5 w=78
{
	height=h;//height=5.5
	weight=w;//weight=78
	}
}
public class classDemo {

	public static void main(String[] args) {
		float height,weight;
		//object creation
			human manikandan=new human();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter height and weight");
			height=sc.nextFloat();
			weight=sc.nextFloat();
			//invoke methodsetheightandweight
			manikandan.setheightandweight(height,weight);
			System.out.println("height:"+manikandan.height+"weight:"+manikandan.weight);}
	
	
	{		
	//object creation
		human manikandan=new human();
		//using instance variable
		manikandan.height=5.5f;
		manikandan.weight=78f;
		System.out.println("height:"+manikandan.height+"weight:"+manikandan.weight);
		}
	
	{
		float height,weight;
	//object creation
		human manikandan=new human();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height and weight");
		height=sc.nextFloat();
		weight=sc.nextFloat();
		manikandan.setheightandweight(height, weight);
		
		System.out.println("height:"+manikandan.height+"weight:"+manikandan.weight);
		
		
	
	


	}
}
//1.you can assign value in the variable using instance
//2.you can assign value in the variable using method
//3.you can assign value in the variable using contructor
