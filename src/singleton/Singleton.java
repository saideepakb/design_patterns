package singleton;

public class Singleton {
	private static Singleton singleton;
	private String description;
	private Singleton(String desc) {
		description = desc;
	}
	
	public static synchronized Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton("Default");
			return singleton;
		}
		
		return singleton;
	}
	
	public void setDescription(String desc) {
		description = desc;
	}
	
	public String getDescription() {
		return description;
	}
}
