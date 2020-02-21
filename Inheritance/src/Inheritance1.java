
class Inheritance1 
{
	int empno=100;
	void displayempno()
	{
		System.out.println("empno"+empno);
	}
}
	class Derived extends Inheritance1
	{
	
		String empname="madhu";
		void displayname()
		{
			System.out.println("empname"+empname);
			
		}
	


	public static void main(String[] args)
	
	{
		Derived D=new Derived();
		D.displayempno();
		D.displayname();
	}
	}

