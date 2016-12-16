package factory_method;

public class ChicagoVeggiePizza extends Pizza{
	public ChicagoVeggiePizza() {
		name = "veggie";
		dough = "thick";
		sauce = "marinara";
		toppings.add("peppers");
		toppings.add("onion");
		toppings.add("mushroom");
	}
}
