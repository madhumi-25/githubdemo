package Collections;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args)
	{
		HashSet<Float> hs = new HashSet<Float>();
		
		hs.add(32.07F);
		hs.add(50.65F);
		hs.add(37.32F);
		hs.add(50.99F);
		hs.add(50.99F);
		
		System.out.println(hs);
		
		hs.remove(1); //(0th position first element, 1thposition second element)
		System.out.println("After removing second element: "+hs);
		
		System.out.println("The Array List Elements are: ");
		Iterator itr =hs.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
		}
	}

	}


