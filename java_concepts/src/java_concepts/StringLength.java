package java_concepts;

public class StringLength {

	public static void main(String[] args) 
	{
		String s = "I got job in cts";
		int l =s.length();
		int p = s.indexOf(' ',2);
		System.out.println("Print The Space Position : " +p);
		p=s.indexOf(' ',13);
		System.out.println("Print The Space Position : " +p);
		int c;
		int co=0;
		for(int i=0;i<l;i++)
		{
			c=s.charAt(i);
		if(c==' ')
		{
			co++;
		}
		}
		System.out.println("Spacing count : " +co);
		System.out.println("Words count : " +(co+1));
		System.out.println("Full length : " +l);
	}
	
}


