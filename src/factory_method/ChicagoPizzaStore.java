package factory_method;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	Pizza createPizza(String type) {
		if(type=="cheese") {
			return new ChicagoCheesePizza();
		} else {
			return new ChicagoVeggiePizza();
		}
	}
}
