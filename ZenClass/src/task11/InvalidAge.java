package task11;
import java.util.Scanner;

public class InvalidAge extends Exception
{
	public InvalidAge()
	{
		System.out.println("Entered age is not eligible to vote ");
	}
	public static void main(String[] args)
	{  

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age  ");
		int age=sc.nextInt();
		
		try
		{
			if(age<18)
				throw new InvalidAge();
			
		}
		catch(InvalidAge ex)
		{
			System.out.println("Entered an invalid number "+ age);
		}
		finally
		{
			System.out.println("Program completed");
		}
		//sc.close();
	
		
	}
	
}

