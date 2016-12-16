package strategy;

public class Squeak implements SpeakBehavior {
	@Override
	public void speak() {
		System.out.println("Squeak");
	}
}
