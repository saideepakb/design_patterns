package strategy;

public class Driver {

	public static void main(String[] args) {
		Duck bDuck = new BrownDuck();
		bDuck.display();
		bDuck.performSpeak();
		bDuck.performFly();
		System.out.println("");
		
		Duck mDuck = new MallardDuck();
		mDuck.display();
		mDuck.performSpeak();
		mDuck.performFly();
		System.out.println("");
		
		Duck rDuck = new RubberDuck();
		rDuck.display();
		rDuck.performSpeak();
		rDuck.performFly();
		
	}

}
