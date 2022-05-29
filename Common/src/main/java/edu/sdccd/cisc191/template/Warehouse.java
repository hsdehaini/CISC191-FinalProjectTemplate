package edu.sdccd.cisc191.template;
import java.util.ArrayList;

/**
 * A Warehouse receives, stores and ships Items.
 *
 * Adapted from Tasha Frankie and Allan Schougaard
 */
public class Warehouse
{
    /**
     * storage is managed as one big stack, where items are laid on top of each
     other
     */
    private ArrayList<Item> storage = new ArrayList<Item>();
    public int getNumberOfItemsInStock()
    {

        return storage.size();
    }
    /**
     *
     *
     * @param item the item to store in the Warehouse
     */
    public void receive(Item item)
    {

        synchronized (storage)
        {
            storage.add(item);
        }
    }
    /**
     *
     * @return the item that was retrieved from storage
     * @throws OutOfStockException if there are no items to ship
     */
    public Item ship() throws OutOfStockException
    {
        System.out.println("Warehouse ship() running in Thread: " + Thread.currentThread().getName());
        // if there are any items in storage
        synchronized (storage)
        {
            if (storage.size() >= 1)
            {
                return storage.remove(storage.size() - 1);
            }
            else
            {
                throw new OutOfStockException();
            }
        }
    }
}