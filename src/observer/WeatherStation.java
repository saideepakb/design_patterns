package observer;

public class WeatherStation {
	public static void main(String[] args) throws InterruptedException {
		WeatherData subject = new WeatherData();
		for(int index = 0; index < 5; index++) {
			subject.registerObserver(new ConditionsDisplay());
		}
		int temp = 60;
		double humidity = 84.43d;
		double pressure = 50d;
		for(int index = 0; index < 10; index++) {
			subject.dataChanged(temp++, humidity++, pressure++);
			Thread.sleep(1000);
		}
	}
	
}
