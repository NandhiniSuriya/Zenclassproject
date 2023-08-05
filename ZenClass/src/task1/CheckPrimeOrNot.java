package task1;

import java.util.Scanner;

public class CheckPrimeOrNot {
public static void main(String[] args) {
		
	    
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :   ");
		int a=sc.nextInt();
		int count =0;
		//prime number = 5
		
		if(a>1)  //greater than 1
		{
			for(int i=1;i<=a;i++)  //checking condition here 1<=5
			{
				if(a%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("prime number ");
			}
	        else
		    {
			System.out.println("Not a prime number");
		    }
		}
		/*else
			System.out.println("Not a prime number");*/
		

}
}
