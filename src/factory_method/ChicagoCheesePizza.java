package factory_method;

public class ChicagoCheesePizza extends Pizza{
	public ChicagoCheesePizza() {
		name = "cheese";
		dough = "thick";
		sauce = "marinara";
		toppings.add("Mozeralla");
		toppings.add("Parmesan");
	}
}
