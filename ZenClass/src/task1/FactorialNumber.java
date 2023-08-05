package task1;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
		
	    
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :   ");
		int a=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=5;i++)
		{
			fact=i*fact;
			
		}
		System.out.println("Fcatorial of a number is :  "+fact);

}
}

