package java_concepts;

public class SplitWordsString {

	public static void main(String[] args) 
	{
		String s="I got job in cts";
		int p1=0;
		int p2= s.indexOf(' ',p1);
		String s1=s.substring(p1,p2);
		System.out.println(s1);
		
		p1=p2+1;
		p2=s.indexOf(' ',p1);
		String s2=s.substring(p1,p2);
		System.out.println(s2);
		
		p1=p2+1;
		p2=s.indexOf(' ',p1);
		String s3=s.substring(p1,p2);
		System.out.println(s3);
		
		p1=p2+1;
		p2=s.indexOf(' ',p1);
		String s4=s.substring(p1,p2);
		System.out.println(s4);
		
		
		p1=p2+1;
		p2=s.indexOf(' ',p1);
		if(p2==-1)
		{
		p2=s.length();
		String s5=s.substring(p1,p2);
		System.out.println(s5);	
		}
	}

}
