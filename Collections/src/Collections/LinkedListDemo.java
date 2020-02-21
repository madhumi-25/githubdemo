package Collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<Float> ll = new LinkedList<Float>();
		
		ll.add(32.07F);
		ll.add(50.65F);
		ll.add(37.32F);
		ll.add(31.78F);
		
		System.out.println(ll);
		
		ll.remove(50.65F); 
		System.out.println("After removing second element: "+ll);
		
		System.out.println("The Array List Elements are: ");
		Iterator itr =ll.iterator();
		
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
		}
	}
	}


