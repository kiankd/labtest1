package labtest01;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public final class Corporation
{
	private static final Corporation INSTANCE = new Corporation();
	
	private Corporation(){}
	
	/**
	 * @return the singleton instance of a corporation.
	 */
	public static Corporation getCorporation()
	{
		return INSTANCE;
	}
	
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
}
