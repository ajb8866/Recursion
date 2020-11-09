
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
		return bites = 0;
	}

}
