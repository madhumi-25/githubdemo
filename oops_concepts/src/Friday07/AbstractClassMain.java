package Friday07;

public class AbstractClassMain {

	public static void main(String[] args) 
	{
		AbstractClassBank b;
		b= new AbstractClassIcici();
		System.out.println("ICICI ROI : "+b.get_roi());
		
		b= new AbstractClassHdfc();
		System.out.println("HDFC ROI : "+b.get_roi());

	}

}
