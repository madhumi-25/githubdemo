package Collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet<Float> ts = new TreeSet<Float>();
		
		ts.add(32.07F);
		ts.add(50.65F);
		ts.add(37.32F);
		ts.add(50.99F);
		ts.add(50.99F);
		
		System.out.println(ts);
		
		ts.remove(37.32F); //(0th position first element, 1thposition second element)
		System.out.println("After removing second element: "+ts);
		
		System.out.println("The Array List Elements are: ");
		Iterator itr =ts.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
		}

	}

}
