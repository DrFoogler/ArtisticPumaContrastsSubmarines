import java.util.ArrayList;

/**
 * <p>This class represents a backpack containing items.  
 * 
 * <p>You can do the following to a <code>Backpack</code> object:
 * <ul>
 * <li>add items one at a time,
 * <li>get the number of items present, 
 * <li>get the name of the first and last items to be added, and 
 * <li>spill out the contents, which empties the bag's contents.
 * </ul>
 *  
 * @author mferraro <a href="mailto:mferraro@balstaff.org">email</a>
 */
public class Backpack {
	
	private ArrayList<String> contents = new ArrayList<String>();
	
	public Backpack() {
	}
	
	/**
	 * method to add an item, represented by a String, to the <code>Backpack</code>.
	 * 
	 * @param item the name of the item to add to <code>Backpack</code>
	 */
	public void addItem(String item) {
		contents.add(item);
		System.out.println("Adding " + item + "...Done!");
	}
	
	/**
	 * Returns the name of the last item added to the <code>Backpack</code>.
	 * @return name of the last item
	 */
	public String getLastItem() {
		if ( contents.size() > 0 ) {
			return contents.get(contents.size()-1);
		} else {
			return "none";
		}
	}
	
	/**
	 * Returns the name of the first item added to the <code>Backpack</code>.
	 * @return name of the first item
	 */
	public String getFirstItem() {
		if ( contents.size() > 0 ) {
			return contents.get(0);
		} else {
			return "none";
		}
	}
	
	/**
	 * Returns the number of items currently stored in the <code>Backpack</code>.
	 * @return number of items
	 */
	 public int numItems() {
		return contents.size();
	}
	
	/**
	 * "Spills out" the contents of a backpack with the following side effects:
	 * <ul>
	 * <li>prints the name of each item
	 * <li>removes all items, returning the item count to 0
	 * </ul>
	 */
	 public void spillContents() {
		System.out.println("\nSpilling out contents of the backpack:");
		for(String item : contents) {
			System.out.println(item);
		}
		contents.clear();
		System.out.println("Backpack is now empty!\n");
	}
}
