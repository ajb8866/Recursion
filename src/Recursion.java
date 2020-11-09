
public class Recursion {
	private int bites = 10;
			
	public Recursion(int bites)
	{
		this.bites = bites;
	}
	public Recursion()
	{
		//nothing to implement
	}
	
	public void takeABite()
	{
		--bites;
		System.out.print("Yum...");
	}
	public boolean isEmpty()
	{
		boolean checker = false;
		if (bites == 0)
			checker = true;
		return checker;
	}

}
