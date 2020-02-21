package java_concepts;

public class SplitwordsForloopString {

	public static void main(String[] args) 
	{
	int p1=0,p2 = 0;
	String s="I got job in cts";
	
	while(p2!=-1)
	{
		p2=s.indexOf(' ',p1);
		if(p2==-1)
			{
			p2=s.length();
			String s1=s.substring(p1,p2);
			System.out.println(s1);
			break;
			}
		else
		{
		String s2=s.substring(p1,p2);
		p1=p2+1;
		System.out.println(s2);
				
		}
   
	}

}
}