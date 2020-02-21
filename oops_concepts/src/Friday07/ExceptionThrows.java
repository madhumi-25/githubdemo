package Friday07;

public class ExceptionThrows 
{
	public void f1() throws ArithmeticException
	{
		System.out.println("In f1 Before");
		int a=10,b=0,c;
		c=a/b;
		System.out.println("In f1 After");
	}
	public static void main(String[] args) 
	{
		System.out.println("In Main Before");
		try
		{
			ExceptionThrows et = new ExceptionThrows();
			et.f1();
		}
		catch(ArithmeticException ae)
		{
		System.out.println("Arithmetic Exception is found");
		}
		System.out.println("In Main After");
		/*finally()
		{
			//dono how to do
		}*/
	}
}
