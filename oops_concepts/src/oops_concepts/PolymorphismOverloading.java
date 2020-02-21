package oops_concepts;

public class PolymorphismOverloading {

		int sum(int x,int y)
		{
			return (x+y);
		}
		
		float sum(int x,int y,float z)
		{
			return(x+y+z);
		}
		int sum(int x,int y,int z)
		{
			return (x+y+z);
		}
		float sum(float x,int y)
		{
			return (x+y);
		}
}