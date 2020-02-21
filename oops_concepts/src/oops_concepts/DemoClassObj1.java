package oops_concepts;

public class DemoClassObj1 
{
	int rno;
	String name;
	int java,maths;
	float avg;
	
	public void average()
	{
		avg=(java+maths)/2f;
	}
	public void display()
	{
		System.out.println("Roll number : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Java marks : "+java);
		System.out.println("Maths marks : "+maths);
		System.out.println("The average mark is : "+avg);
	}
	
}
