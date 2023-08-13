package task11;

import java.util.Scanner;

public class Program4 {
	
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value ");
		int a=sc.nextInt();
		//System.out.println(a);
		
		System.out.println("Enter b value ");
		int b=sc.nextInt();
		//System.out.println(b);
		//int a=100;
		//int b=0;
		
	try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Entered into catch block");
		}
		sc.close();
		
	}

}
