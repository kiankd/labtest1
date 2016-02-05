package labtest01;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{
		// create new inventory add it to corporation then iterate through
		Inventory inventory = new Inventory("test_inventory");
		inventory.stock(ITEM_CEREAL, 1);
		inventory.stock(ITEM_JAM, 1);
		inventory.stock(ITEM_BUTTER, 1);
		
		Corporation evilCorp = Corporation.getCorporation();
		evilCorp.addInventory(inventory);
		
		for (Item item : inventory)
		{
			System.out.println(item);
		}
		
	}
}
