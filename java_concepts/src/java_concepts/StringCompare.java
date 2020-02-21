package java_concepts;

public class StringCompare {

	public static void main(String[] args) 
	{
	String s1 = "CTS",s2 = "CTS",s3 = "cTS";
	int r;
	
	r= s1.compareTo(s2);
	if(r==0)
	System.out.println("String s1 and s2 are same");
	else
		System.out.println("String s1 and s2 are different");
	
	r= s2.compareTo(s3);
	if(r==0)
		System.out.println("String s1 and s2 are same");
	else
		System.out.println("String s1 and s2 are different");
	
	r= s1.compareToIgnoreCase(s3);
	if(r==0)
		System.out.println("String s1 and s2 are same");
		else
			System.out.println("String s1 and s2 are different");
	}

}
