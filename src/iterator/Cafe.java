package iterator;

public class Cafe {

	public static void main(String[] args) {
		Menu lunchMenu = new LunchMenu();
		Iterator lunchIterator = lunchMenu.createIterator();
		
		// The cafe now can access items in the lunch menu without having to know its implementation details
		// This is because of the iterator interface!
		while(lunchIterator.hasNext()) {
			System.out.println(lunchIterator.next());
		}
	}
}
