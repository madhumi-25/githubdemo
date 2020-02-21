package Collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet<Float> lhs = new LinkedHashSet<Float>();
		
		lhs.add(32.07F);
		lhs.add(50.65F);
		lhs.add(37.32F);
		lhs.add(50.99F);
		lhs.add(50.99F);
		
		System.out.println(lhs);
		
		lhs.remove(32.07F); //(0th position first element, 1thposition second element)
		System.out.println("After removing second element: "+lhs);
		
		System.out.println("The Array List Elements are: ");
		Iterator itr =lhs.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
		}
	}

	}

