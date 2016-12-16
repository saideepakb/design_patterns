package factory_method;

public class Driver {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza chicagoCheesePizza = chicagoStore.orderPizza("cheese");
		System.out.println(chicagoCheesePizza.getContents());
		
		Pizza nyCheesePizza = nyStore.orderPizza("cheese");
		System.out.println(nyCheesePizza.getContents());

		Pizza nyVegPizza = nyStore.orderPizza("");
		System.out.println(nyVegPizza.getContents());

		Pizza chicagoVegPizza = chicagoStore.orderPizza("");
		System.out.println(chicagoVegPizza.getContents());

	}
}
