package new_prog;

import java.util.Scanner;

public class p_n {

	public static void main(String[] args)
	{
		int s;
		System.out.println("Enter a value");
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextInt();
		if( s > 0)
		{
			System.out.println("The given no. is positive");
		}
		else if(s < 0)
		{
			System.out.println("The given no. is negative");
		}
		

	}

}
