package task11;
import java.io.*;


public class FilenotFound {
	
	public static void main(String[] args) throws IOException
	{
		FileReader filereader = new FileReader("test.txt");
		BufferedReader bufferreader = new BufferedReader(filereader);
		
	     String filedata=null;
	     while((filedata =bufferreader.readLine())!=null)
	     {
	    	 System.out.println(filedata);
	     }
	     try
	     {
	    	 bufferreader.close();
	    	 
	     }
	     catch(IOException e)
	     {
	    	 e.printStackTrace();
	     }
	}

}
