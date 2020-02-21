 class polymorphism
{
 int studNo=707;
 void displayStud()
 {
	 System.out.println("Student No. : " +studNo);
 }
 void displayStud(String studName)
 {
	 System.out.println("Student Name : " +studName);
 }
}
public class Overloading
{
	
public static void main(String[] args) 
{
	polymorphism p1=new polymorphism();
	p1.displayStud();
	p1.displayStud("Madhumi");
	}

}
