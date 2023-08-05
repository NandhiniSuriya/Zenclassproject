package task9;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number :   ");
		int a=sc.nextInt(); 
		System.out.println("Enter second number :   ");
		int b=sc.nextInt(); 
		System.out.println("Enter third number :   ");
		int c=sc.nextInt(); 
		
		if((a>b)&& (a>c))
		{
			System.out.println(a);	
		}
		if((b>a)&& (b>c))
		{
			System.out.println(b);	
		}
		if((c>a)&& (c>b))
		{
			System.out.println(c);	
		}
	}
		
		

}
