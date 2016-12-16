package strategy;

public class RubberDuck extends Duck{
	public RubberDuck() {
		this.speakBehavior = new Squeak();
		this.flyBehavior = new NoFly();
	}
}
