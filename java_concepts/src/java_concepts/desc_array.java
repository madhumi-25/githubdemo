package java_concepts;

import java.util.Scanner;

public class desc_array 
{
	public static void main(String[] args) 
	{
		int totalNos,temp;
		int a[] = new int[10];
		System.out.println("Enter the total numbers : ");
		Scanner s = new Scanner(System.in);
		totalNos=s.nextInt();
		for(int i=0;i<totalNos;i++)
			a[i]=s.nextInt();
		for (int i=0; i < totalNos; i++) 
        {
            for (int j = i + 1; j < totalNos; j--) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		System.out.println("The List of numbers in Descending order :");
		for (int i = 0; i < totalNos - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[totalNos - 1]);
	}
}
