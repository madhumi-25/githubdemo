package oops_concepts;

public class AbstractClassMain {

	public static void main(String[] args) 
	{
		AbstractClassBank b;
		b= new AbstractClassIcici();//child class so we are using obj like this
		b.show();
		System.out.println("ICICI ROI : "+b.get_roi());
		
		b= new AbstractClassHdfc();
		System.out.println("HDFC ROI : "+b.get_roi());

	}

}
