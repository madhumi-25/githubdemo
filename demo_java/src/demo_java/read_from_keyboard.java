package demo_java;

import java.util.Scanner;

public class read_from_keyboard {

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Enter a value of A");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter a value of B");
		b = scanner.nextInt();
		c = a+b;
		System.out.println("The result is " + c);
	}

}
