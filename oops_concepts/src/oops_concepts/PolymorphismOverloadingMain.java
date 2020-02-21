package oops_concepts;

public class PolymorphismOverloadingMain {

	public static void main(String[] args) 
	{
		PolymorphismOverloading o=new PolymorphismOverloading();
		System.out.println("Two parameters values(both int) : "+o.sum(50, 80));
		System.out.println("Three parameters values(two int one float) : "+o.sum(50, 80,90.5f));
		System.out.println("Three parameters values(three int) : "+o.sum(50, 80,70));
		System.out.println("Two parameters values(one float one int) : "+o.sum(50.8f, 80));
	}
}
