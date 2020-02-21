package demo_java;

import java.util.Scanner;

public class add_threeno {

	public static void main(String[] args)
	{
		int a,b,c,d;
		System.out.println("Enter a value of A");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter a value of B");
		b = scanner.nextInt();
		System.out.println("Enter a value of C");
		c = scanner.nextInt();
		d = a+b+c;
		System.out.println("The addition is " + d);
		System.out.println("The result is " + (a+b+c)/3);
	}

}
