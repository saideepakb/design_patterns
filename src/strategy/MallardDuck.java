package strategy;

public class MallardDuck extends Duck{
	public MallardDuck() {
		this.speakBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
}
