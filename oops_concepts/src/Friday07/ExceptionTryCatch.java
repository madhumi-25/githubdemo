package Friday07;

public class ExceptionTryCatch {

	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println("The Value of c : "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("In catch block");
		}
	}
}