package java_concepts;

public class SumEvenNoOddPosition {

	public static void main(String[] args) 
	{
	int[] a = {91,27,28,84,37,65,44,32};
	int sum = 0;
	for(int i=0;i<=7;i++)
	{
		if(i%2==0)
		{
		if(a[i]%2==0)
		{
			System.out.println("The value: "+a[i]);
			sum=sum+a[i];
		}
		}
	
	}
	System.out.println("The Sum is : "+sum);
	}

}
