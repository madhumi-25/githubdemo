package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapDemo {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		lhm.put(999, "Rag");
		lhm.put(777, "Madhu");
		//lhm.put(190, null);
		lhm.put(777, "Savita");
		//lhm.put(null, null);
		//hm.put(null, null);
		System.out.println(lhm);//Displays in any order we don't know
		
		lhm.remove(190);
		System.out.println("Displaying elements after removing 190 : "+lhm);

		for(Map.Entry<Integer,String> mentry : lhm.entrySet())
			System.out.println("Key : "+mentry.getKey() + "\t Value : "+mentry.getValue());

	}

}
