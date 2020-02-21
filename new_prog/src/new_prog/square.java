package new_prog;

import java.util.Scanner;

public class square {

	public static void main(String[] args) 
	{
		int s;
		System.out.println("Enter a value");
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextInt();
		System.out.println("The Square of the given value is " + s*s);

	}

}
