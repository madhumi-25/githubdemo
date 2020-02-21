package oops_concepts;

public class ConstructorDemo 
{
	int rno;
	String name;
	int java,maths;
	float avg;
	
	public void ConstructorDemo(int rno,String name,int java,int maths)
	{
		this.rno=rno;
		this.name=name;
		this.java=java;
		this.maths=maths;
		
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
	public static void main(String[] args) 
	{
		ConstructorDemo cd=new ConstructorDemo();
		cd.ConstructorDemo(77,"Madhumi",85,90);
		ConstructorDemo cd1=new ConstructorDemo();
		cd1.ConstructorDemo(78,"Pavi",87,92);
		cd.display();
		System.out.println("============================");
		cd1.display();
	}
}