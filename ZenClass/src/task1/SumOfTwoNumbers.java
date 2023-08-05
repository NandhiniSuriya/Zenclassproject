package task1;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args)
	{
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a value :   ");
	int a =sc.nextInt();
	
	System.out.println("Enter b value :   ");
	int b =sc.nextInt();
	
	System.out.println("Enter c value :   ");
	int c =sc.nextInt();
	
	System.out.println("Enter d value :   ");
	int d =sc.nextInt();
	
	int result = a+b;
	int result1 = c+d;
	
	if(result>result1)
	{
		System.out.println("sum of a and b greater than c and d");
	}
	else
	{
		System.out.println("sum of c and d greater than a and b");
		
	}
	
	}
}
