package inheritance.model;

public class ThirdThing extends SubThing implements OtherInterface
{
	public int [] stackOfNumbers()
	{
		int [] stuffInside = {1,3,4,5,6,7};
		return stuffInside;
	}
	
	public void uselessMethod()
	{
		
	}
	
	public void otherUselessMethod(double someThingElse)
	{
		
	}
	
	public void doesOtherNada()
	{
		
	}
	
	public int countsNada(int numbers)
	{
		return numbers;
	}
	
	public void doesNada()
	{
		System.out.println("The subclass verion");
		super.doesNada();
	}
}

