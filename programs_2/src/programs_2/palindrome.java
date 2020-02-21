package programs_2;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int r,sum = 0,t,n;
		System.out.println("Enter a valure to check it is a palindrome or not: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		t=n;
		while (n>0)
		{
			r = n%10;
			sum = sum*10 + r;
			n/=10;
		}

		if(t==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}

}
