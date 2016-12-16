package decorator;

public class Driver {
	public static void main(String[] args) {
		Pizza onionPepperPizza = new Onion(new GreenPepper(new PlainPizza()));
		System.out.println(onionPepperPizza.getDescription());
		System.out.println("This Pizza costs: " + onionPepperPizza.getCost());
	}
}
