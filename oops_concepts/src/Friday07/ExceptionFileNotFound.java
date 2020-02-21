package Friday07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFileNotFound {
	public static void main(String args[])
	  {
	    FileInputStream fis = null;
	    try
	    {
	      fis = new FileInputStream("C:/Users/BLTuser.BLT1226/Desktop/mad.txt");
	    }
	    catch(FileNotFoundException fe)
	    {
	      System.out.println("The source file does not exist. " + fe);
	    }          
	    
	    int k;
	    try
	    
	    {
	      while(( k = fis.read() ) != -1)
	      {
	        System.out.print((char)k);
	      }
	      fis.close();
	    }
	    catch(IOException e)
	    {
	      System.out.println("Some IO problem. " + e);
	    }          
	  }	
}
