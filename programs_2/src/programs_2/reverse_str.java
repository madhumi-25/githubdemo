package programs_2;

import java.util.Scanner;

public class reverse_str {

	public static void main(String[] args) 
	{
		String a,b = "";
		System.out.println("Enter a string to reverse ");
		Scanner s = new Scanner(System.in);
		a=s.nextLine();
		int length=a.length();
		for(int i = length-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Reverse String is : " + b);
	}
	

}
