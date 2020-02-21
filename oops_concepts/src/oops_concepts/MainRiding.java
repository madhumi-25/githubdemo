package oops_concepts;

public class MainRiding {

	public static void main(String[] args) 
	{
		ClassBankRiding b;
		b=new ClassHdfcRiding();
		System.out.println("Rate of Interest HDFC bank: "+b.get_roi());
		b=new ClassSbiRiding();
		System.out.println("Rate of Interest SBI bank: "+b.get_roi());
	}

}
