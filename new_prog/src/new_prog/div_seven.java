package new_prog;

import java.util.Scanner;

public class div_seven {

	public static void main(String[] args)
	{
	int s;
	System.out.println("Enter a value");
	Scanner scanner = new Scanner(System.in);
	s = scanner.nextInt();
	if((s%7) == 0)
	{
		System.out.println("The given no. is Divisible by seven");
	}
	else
	{
		System.out.println("The given no. is not Divisible by seven");
	}
	}

}
