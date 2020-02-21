package Friday07;

public class ArrayBoundException {

	public static void main(String[] args) 
	{
		try
		{
			int[] arr= {1,2,3};
			System.out.println(arr[4]);//Exceeds position
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("Array Index Out Of Bounds Exception is found");
		}
	}
}