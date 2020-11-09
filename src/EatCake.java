
public class EatCake {
	public EatCake()
	{
		
	}
	
	public static void eatCakeIt(Recursion cake)
	{
		while (! cake.isEmpty())
		{
			cake.takeABite();
		
		}
	}
	public static void eatCakeRe(Recursion cake)
	{
		if (!cake.isEmpty())
		{
			cake.takeABite();
			eatCakeIt(cake);
		}
			
	}

	public static void main(String[] args) {
		
		Recursion cakeOne = new Recursion();
		eatCakeIt(cakeOne);
		System.out.println("Done eating cake one . It was tasty!");
		Recursion cakeTwo = new Recursion();
		eatCakeRe(cakeTwo);
		System.out.println("Done eating cake two . It was tasty!");
		
		// TODO Auto-generated method stub

	}

}
