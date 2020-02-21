package Friday07;

public class ExceptionString {

	public static void main(String[] args) {
	int a=10,b=6,c;
	String name="Madhumiii";//null;
	try
	{
		//c=a/(b-6);
		System.out.println("The length of the String : "+name.length());
		int x=Integer.parseInt(name);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic Exception");
	}
	catch(NullPointerException npe)
	{
		System.out.println("Null Pointer Exception");
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("Number Format Exception");
	}
	catch(Exception e)
	{
		System.out.println("Exception");
	}
	
	}

}