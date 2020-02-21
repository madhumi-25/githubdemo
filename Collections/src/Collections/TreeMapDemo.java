package Collections;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {

	public static void main(String[] args) 
	{	
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(999, "Rag");
		tm.put(777, "Madhu");
		//tm.put(190, null);
		tm.put(777, "Savita");
		//tm.put(null, null);
		//hm.put(null, null);
		System.out.println(tm);//Displays in any order we don't know
		
		tm.remove(190);
		System.out.println("Displaying elements after removing 190 : "+tm);

		for(Map.Entry<Integer,String> mentry : tm.entrySet())
			System.out.println("Key : "+mentry.getKey() + "\t Value : "+mentry.getValue());
	}

}
