
public class CookerApp {

	public static void main(String[] args) {
		Cooker myCooker = new Cooker();
		myCooker.cook();
		System.out.println("I'm cooking now...!");
		Cooker myGrill = new Grill();
		myGrill.cook();
		Cooker myPizzaOven = new PizzaOven();
		Cooker myStove = new Stove();
		myStove.cook();

	}

}
