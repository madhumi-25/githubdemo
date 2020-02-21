package java_concepts;

public class sumofoddnumbers {

	public static void main(String[] args) 
	{
		int a=1234567,m ,sum=0;
		while(a>0)
		{
			m=a%10;
		if(m%2!=0)
		{
			sum=sum+m;
		}
		a=a/10;
		}
System.out.println(sum);
	}

}
