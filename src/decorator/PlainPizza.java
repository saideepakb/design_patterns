package decorator;

public class PlainPizza implements Pizza{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a pizza containing the following items: ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.00;
	}

}
