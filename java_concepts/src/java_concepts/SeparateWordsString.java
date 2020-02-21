package java_concepts;

public class SeparateWordsString {

	public static void main(String[] args) 
	{
	String s="I got job in cts";
	//String s1=s.substring(0,1);
	//System.out.println(s1);
	//String s2=s.substring(2,5);
	//System.out.println(s2);
	//String s3=s.substring(6,9);
	//System.out.println(s3);
	//String s4=s.substring(10,12);
	//System.out.println(s4);
	//String s5=s.substring(13,16);
	//System.out.println(s5);
	
	int l =s.length();
	int co=0,c;
	for(int i=0;i<l;i++)
	{
		c=s.charAt(i);
	if(c==' ')
	{
		co++;
	}
	}
	}

}
