package factory_method;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if(type=="cheese") {
			return new NYCheesePizza();
		} else {
			return new NYVeggiePizza();
		}
	}
	
}
