package decorator;

public class GreenPepper extends ToppingDecorator{

	public GreenPepper(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription() {
		return pizza.getDescription() + "Green Peppers, ";
	}
	
	public double getCost() {
		return pizza.getCost() + 0.25;
	}
}
