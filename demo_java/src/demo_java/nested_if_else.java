package demo_java;

public class nested_if_else {

	public static void main(String[] args)
	{
		int marks = 75;
		if(marks >= 91 && marks <= 100)
		{
			System.out.println("Grade A");
		}
		else if(marks >= 81 && marks <= 90)
		{
			System.out.println("Grade B");
		}
		else if(marks >= 71 && marks <= 80)
		{
			System.out.println("Grade C");
		}
		else if(marks >= 60 && marks <= 70)
		{
			System.out.println("Grade D");
		}
		else if(marks >= 50 && marks <= 60)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
