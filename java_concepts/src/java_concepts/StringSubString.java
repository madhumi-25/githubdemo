package java_concepts;
import java.util.*;

public class StringSubString {

	public static void main(String[] args) 
	{
	String s = "I got job in cts";
	String s1 = s.substring(0,5);
	System.out.println(s1);
	String s2 = s.substring(2,9);
	System.out.println(s2);
	String s3 = s.substring(6,16);
	System.out.println(s3);
	int l=s.length();
	System.out.println("Length of the string : "+l);
	

	}

}
