package Collections;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(999, "Rag");
		ht.put(777, "Madhu");
		//ht.put(190, null);
		ht.put(777, "Savita");
		//ht.put(null, null);
		//hm.put(null, null);
		System.out.println(ht);//Displays in any order we don't know
		
		ht.remove(190);
		System.out.println("Displaying elements after removing 190 : "+ht);

		for(Map.Entry<Integer,String> mentry : ht.entrySet())
			System.out.println("Key : "+mentry.getKey() + "\t Value : "+mentry.getValue());

	}

}
