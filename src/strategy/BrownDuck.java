package strategy;

public class BrownDuck extends Duck {
	public BrownDuck() {
		this.flyBehavior = new FlyWithWings();
		this.speakBehavior = new Quack();
	}
}
