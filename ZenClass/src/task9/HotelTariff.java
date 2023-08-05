package task9;

import java.util.Scanner;

public class HotelTariff {
public static void main(String[] args) {
		
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter month :   ");
		int month =sc.nextInt(); 
		System.out.println("Enter room rent :   ");
		float rent =sc.nextFloat(); 
		System.out.println("Enter number of days :   ");
		int days =sc.nextInt(); 
	
		
		
	switch(month)
	{
	case 1:
	case 2:
	case 3:
	case 7:
	case 8:
	case 9:
	case 10:
		  float result = rent*days;
		  System.out.printf("%.2f",result);
		  break;
	case 4:
	case 5:
	case 6:
	case 11:
	case 12:
		 double overallrent=((rent+(rent*0.2))*days);
		 System.out.printf("%.2f",overallrent);
		 break;

}
}
}


