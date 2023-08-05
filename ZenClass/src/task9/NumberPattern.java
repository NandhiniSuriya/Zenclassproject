package task9;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		//pattern program
		
        int k=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :   ");
		int a=sc.nextInt();  //4
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println(" " );
		}
		
		
	}
}
