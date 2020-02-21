package java_concepts;

import java.util.Scanner;

public class list_strings {

	public static void main(String[] args) 
	{
		int totalNos;
		String StringArray[] = new String[10];
		
		System.out.println("Enter the total numbers : ");
		Scanner s = new Scanner(System.in);
		totalNos=s.nextInt();
		
		for(int i=0;i<totalNos;i++)
			StringArray[i]=s.next();
		
		System.out.println("The List of numbers in array : ");
		for(int i=0;i<totalNos;i++)
		System.out.println( StringArray[i]);	
		
	}
}
