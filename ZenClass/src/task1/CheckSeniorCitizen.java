package task1;

import java.util.Scanner;

public class CheckSeniorCitizen {
public static void main(String[] args) {
		
	    
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter age to check senior ciizen or not :   ");
		int a=sc.nextInt();
		
		if(a>=60)
		{
			System.out.println("senior ciizen");
		}
		else
		{
			System.out.println("Not a senior ciizen");
		}

}
}

