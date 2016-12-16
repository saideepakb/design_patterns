package singleton;

public class Driver {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1 == s2);
		s2.setDescription("New Description");
		System.out.println(s1.getDescription());
	}

}
