package strategy;

public class Quack implements SpeakBehavior{
	@Override
	public void speak() {
		System.out.println("Quack");
	}
}
