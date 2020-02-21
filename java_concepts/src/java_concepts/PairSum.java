package java_concepts;
public class PairSum 
{
	public static void main(String[] args) 
	{
	 int[] a= {21,14,7,15,-2,15,22,9,6};
	 int sum=36;
	 for(int i = 0;i <= 8;i++)
	 {
		for(int j=1;j<=7;j++)
			if(a[i]+a[j]==sum)
			{
				System.out.println(a[i]+"+"+a[j]+"=" + sum);
			}
	 }
	}
}
