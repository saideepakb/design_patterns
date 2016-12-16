package iterator;

public class LunchIterator implements Iterator {
	String[] items;
	int position = 0;
	
	public LunchIterator(LunchMenu lunchMenu) {
		items = lunchMenu.menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items[position++];
	}

}
