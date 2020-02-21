package new_prog;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number 1");
		int x,c=0,div;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		div = x%2;
		if(div == 1)
			c++;
		
		System.out.println("Enter the number 2");
		x = scanner.nextInt();
		div = x%2;
		if(div == 1)
		
			c++;
		
		System.out.println("Enter the number 3");
		
		x = scanner.nextInt();
		div = x%2;
		if(div == 1)
		
			c++;
		
		System.out.println("Enter the number 4");
		
		x = scanner.nextInt();
		div = x%2;
		if(div == 1)
		
			c++;
		
		System.out.println("Enter the number 5");
		
		x = scanner.nextInt();
		div = x%2;
		if(div == 1)
		
			c++;
		
		System.out.println(c);
	}
	

}
