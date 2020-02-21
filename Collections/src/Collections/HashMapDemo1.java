package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(999, "Rag");
		hm.put(777, "Madhu");
		hm.put(190, null);
		hm.put(777, "Savita");
		hm.put(null, null);
		//hm.put(null, null);
		System.out.println(hm);//Displays in any order we don't know
		
		hm.remove(190);
		System.out.println("Displaying elements after removing 190 : "+hm);

		for(Map.Entry<Integer,String> mentry : hm.entrySet())
			System.out.println("Key : "+mentry.getKey() + "\t Value : "+mentry.getValue());
	}
}