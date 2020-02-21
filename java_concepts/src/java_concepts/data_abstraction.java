package java_concepts;

public class data_abstraction 
		{
			int emp_no = 100;
			void show()
			{
				System.out.println(emp_no);
			}
	
		public static void main (String[] args)
			{
			data_abstraction  e1 = new data_abstraction ();
			System.out.println(e1.emp_no);
			}
			
		}
class emp
{
	private int emp_no=100;
	void displayempno()
	{
		System.out.println("Emp No. : " +emp_no);
	}

public static void main (String[] args)
{
data_abstraction  e1 = new data_abstraction ();
System.out.println(e1.emp_no);
}
		
}


