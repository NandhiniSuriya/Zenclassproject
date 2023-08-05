package task1;

import java.util.Scanner;

public class PrintCharactersAtoZ {
	public static void main(String[] args) {
		
		//char ch,chr;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a value :   ");
		char chr =sc.next().charAt(0);
		
		for(char ch = chr ;ch<='Z';ch++)
		{
			System.out.println(ch +" ");
			
		}
		
	}

}
