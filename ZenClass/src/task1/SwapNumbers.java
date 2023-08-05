package task1;

import java.util.Scanner;

public class SwapNumbers {
public static void main(String[] args) {
		
	    int c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Before swapping Enter a value :   ");
		int a=sc.nextInt();
		
		System.out.println("Before swapping Enter b value :   ");
		int b=sc.nextInt();
		
		c=b;
		b=a;
		a=c;
		
		System.out.println("After swapping Enter a value :   "+a);
		System.out.println("After swapping Enter b value :   "+b);
		
		
}
}



