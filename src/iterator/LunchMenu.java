package iterator;

public class LunchMenu implements Menu{
	static final int MAX_ITEMS = 10;
	int numberOfItems = 0;
	String[] menuItems;
	
	public LunchMenu() {
		menuItems = new String[MAX_ITEMS];
		addItem("North Indian Thali");
		addItem("South Indian Thali");
		addItem("Gujarati Thali");
	}
	
	
	private void addItem(String item) {
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("Maximum Limit Reached");
			return;
		}
		menuItems[numberOfItems] = item;
		numberOfItems++;
	}


	@Override
	public Iterator createIterator() {
		return new LunchIterator(this);
	}
}
