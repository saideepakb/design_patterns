package strategy;

public abstract class Duck {
	public FlyBehavior flyBehavior;
	public SpeakBehavior speakBehavior;
	
	public void display() {
		System.out.println("I am a Duck!");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performSpeak() {
		speakBehavior.speak();
	}
}
