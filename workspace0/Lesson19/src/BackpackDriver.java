public class BackpackDriver {

	public static void main(String[] args) {
		
		Backpack pack1 = new Backpack();
		
		pack1.addItem("towel");
		pack1.addItem("sunglasses");
		pack1.addItem("Pikachu");
		pack1.addItem("binder");
		pack1.addItem("lunch");
		
		System.out.println("First item that was added: " + pack1.getFirstItem());
		System.out.println("Last item that was added: " + pack1.getLastItem());
		System.out.println("Number of items added: " + pack1.numItems());
		pack1.spillContents();
	}

}
