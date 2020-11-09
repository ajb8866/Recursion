
public class EatCake {
	public EatCake()
	{
		
	}
	
	public static void eatCake(Recursion cake)
	{
		if (!cake.isEmpty())
		cake.takeABite();
		eatCake(cake);
	}

	public static void main(String[] args) {
		
		Recursion cake = new Recursion();
		eatCake(cake);
		System.out.print("Done eating cake. It was tasty!");
		// TODO Auto-generated method stub

	}

}
