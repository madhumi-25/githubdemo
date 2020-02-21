package oops_concepts;

import java.util.ArrayList;
public class ArrayListStudent extends Student
{

	ArrayList<Student> std_al =  new ArrayList<Student>();
	
	public void create_al()
	{
		Student s1 = new Student(10,"m",80,70);
		Student s2 = new Student(11,"r",80,70);
		std_al.add(s1);
		std_al.add(s2);
	}
	public void display_al()
	{
		for(Student s: std_al)
		{
			System.out.println("Name:" +s.name + "ID:" +s.id + "Selenium marks" + s.selenium +"Java marks" + s.java +"Average" +s.avg);
		}
	}

	public static void main(String[] args) 
	{
		ArrayListStudent al = new ArrayListStudent();
		al.create_al();
		System.out.println("Array created");
		al.display_al();
		System.out.println("Array displayed");
	}
}
