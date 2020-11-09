
public class EatCake {
	public EatCake()
	{
		
	}
	
	public void eatCake(Recursion cake)
	{
		
		eatCake(cake);
	}

	public static void main(String[] args) {
		
		Recursion cake = new Recursion();
		eatCake(cake);
		System.out.print("Done eating cake. It was tasty!");
		// TODO Auto-generated method stub

	}

}
