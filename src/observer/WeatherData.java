package observer;

import java.util.*;

public class WeatherData implements Subject{	
	private List<Observer> observers; // Could use a set to improve time complexity
	private int temp;
	private double humidity;
	private double pressure;
	
	
	public WeatherData() {
		observers = new ArrayList<>();
		temp = 0;
		humidity = 0.0d;
		pressure = 0.0d;
	}
	
	@Override 
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override 
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index < 0) {
			return;
		}
		observers.remove(index);
	}
	
	@Override 
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(temp, humidity, pressure);
		}
	}
	
	public void dataChanged(int temp, double humidity, double pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
	
	
	// The following three methods can be used for a pull version of this design pattern
	public int getTemperature() {
		return this.temp;
	}
	
	public double getHumidity() {
		return this.humidity;
	}
	
	public double getPressure() {
		return this.pressure;
	}
}
