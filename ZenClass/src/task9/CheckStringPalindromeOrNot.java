package task9;

import java.util.Scanner;

public class CheckStringPalindromeOrNot {
	public static void main(String[] args) {
		
		//check given string palindrome or not 
		String reverse ="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string :   ");
		String br=sc.nextLine();  //level  
		
		for(int i=br.length()-1;i>=0;i--)  //4,4>=0.
		{
			reverse = reverse+br.charAt(i);
		}
	
		if(br.equals(reverse))
		{
		System.out.print(br+ " is plaindrome");	
		}
		else
		{
		System.out.println(br+"is not palindrome");
		}
		
		}
	}

