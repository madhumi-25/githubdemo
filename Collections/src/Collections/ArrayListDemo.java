package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
	
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("Training");
		al.add("in BLT");
		
		System.out.println(al);
		
		al.remove(1); //(0th position first element, 1thposition second element)
		System.out.println("After removing second element: "+al);
		
		System.out.println("The Array List Elements are: ");
		Iterator itr =al.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
		}
	}
}
