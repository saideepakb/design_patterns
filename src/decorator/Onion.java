package decorator;

public class Onion extends ToppingDecorator{

	public Onion(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return pizza.getDescription() + "Onions, ";
	}
	
	public double getCost() {
		return pizza.getCost() + 0.5;
	}
}
