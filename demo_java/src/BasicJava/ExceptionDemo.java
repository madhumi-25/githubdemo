package BasicJava;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=6,c;
		try
		{
			c=a/(b-6);
			System.out.println("c");
		}
		catch(ArithmeticException ae)
		{
	
	System.out.println("divided by zero error");
		}

	}
}


