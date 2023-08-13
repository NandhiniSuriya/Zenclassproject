package task11;
import java.io.*;
import java.util.Scanner;

class AuthenticationException extends Exception
{
	public AuthenticationException(String message)
	{
		super(message);
	}
}

public class IncorrectPassword {

	public static void main(String[] args)
	{

		  InputStreamReader isr = new InputStreamReader(System.in);
		  BufferedReader br = new BufferedReader(isr);
		  String pwd;
		try {
		System.out.println("Enter password  ");
	    pwd=br.readLine();
		
		if(!pwd.equals("123"))
		{
		throw new AuthenticationException("Incorrect password");
		}
		else 
		{
        System.out.println("Correct password");}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			catch (AuthenticationException a) {
				// TODO Auto-generated catch block
				a.printStackTrace();
		}
		finally
		{
			System.out.println("final block exceuted");
		}
	}

}

