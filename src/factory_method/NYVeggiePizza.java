package factory_method;

public class NYVeggiePizza extends Pizza {
	public NYVeggiePizza() {
		name = "veggie";
		dough = "thin";
		sauce = "marinara";
		toppings.add("peppers");
		toppings.add("onion");
		toppings.add("mushroom");
	}
}
