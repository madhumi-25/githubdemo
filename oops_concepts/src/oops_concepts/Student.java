package oops_concepts;

public class Student {

	int regNo;
	String name;
	int java, maths;
	float avg;
	
	public void Class_Student1(int regNo, String name, int java, int maths)
	{
		this.regNo = regNo;
		this.name = name;
		this.java = java;
		this.maths = maths;
	}
	
	public void average()
	{
		avg = (java + maths) /2.0f;
		System.out.println("the average of java and maths are:" +avg);
	}
	
}
