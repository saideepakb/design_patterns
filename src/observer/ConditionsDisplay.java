package observer;

public class ConditionsDisplay implements Observer {	
	@Override
	public void update(int temp, double humidity, double pressure) {
		System.out.println("Temp is " + temp + "F, Humidity is " + humidity + "% and Pressure is "+ pressure + "Pascal");
	}
}
