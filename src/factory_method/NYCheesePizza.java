package factory_method;

public class NYCheesePizza extends Pizza{
	public NYCheesePizza() {
		name = "cheese";
		dough = "thin";
		sauce = "marinara";
		toppings.add("Mozeralla");
		toppings.add("Parmesan");
	}
}
