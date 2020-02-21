package programs_2;

import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args) 
	{
		int n,r =0;
		System.out.println("Enter numbers to reverse ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		while(n != 0)
		{
			int d = n % 10;
			r = r * 10 + d;
			n /= 10;
		
		}
		System.out.println("Reversed number is : " + r);
	}

}

