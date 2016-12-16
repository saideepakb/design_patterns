package factory_method;
import java.util.*;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("Preparing Pizza");
	}
	
	public void bake() {
		System.out.println("Baking Pizza");
	}
	
	public void cut() {
		System.out.println("Cutting Pizza");
	}
	
	public void box() {
		System.out.println("Boxing Pizza");
	}
	
	public String getContents() {
		return name + "," + dough + "," + sauce + "," + toppings.toString(); 
	}
}
