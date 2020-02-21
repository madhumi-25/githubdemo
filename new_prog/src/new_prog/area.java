package new_prog;

import java.util.Scanner;

public class area {

	public static void main(String[] args) 
	{
		int r;
		final double p = 3.14;
		System.out.println("Enter a value of Radius");
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		System.out.println("Area of the circle " + p*r*r);
	}

}
