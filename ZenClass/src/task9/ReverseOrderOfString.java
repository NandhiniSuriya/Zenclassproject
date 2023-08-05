package task9;

import java.util.Scanner;

public class ReverseOrderOfString {
	
		public static void main(String[] args) {
			
			//reverse string order
			
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter string :   ");
			String br=sc.nextLine();  //Guvi ,4(0to 3) 
			
			for(int i=br.length()-1;i>=0;i--)   //3,2,1,0
			{
				System.out.print(br.charAt(i));  //ivug
			}

}
}