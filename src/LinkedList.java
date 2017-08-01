/**
 * A linked list class
 * @author Justin
 *
 */
class node
{
	private int data;
	public node next;
	node(int d)
	{
		data = d;
		next = null;
	}
	public int Get_Data()
	{
		return data;
	}
}


public class LinkedList {

	private node head = null;
	private int size;
	
	public LinkedList(int d)
	{
		head = new node(d);
		size = 1;
	}
	
	public int getSize()
	{
		return size;
	}
	/**
	 * Appends the new data at the end of the linked list
	 * 
	 * @param New_Data This is the new data value that will inserted into a node.
	 */
	public void append (int New_Data)
	{
		size += 1;
		node next_node = head;
		while(next_node.next != null)
		{				
			next_node = next_node.next;
		}
		
		next_node.next = new node(New_Data);
	}
	/**
	 * Locates the data at the Position that was requested by the user.
	 * If the size is too big or negative, it throws and out of bounds
	 * error.
	 * 
	 * @param Position The potential position where its located in the linked list.
	 * @return Data The number that is stored in data is returned
	 */
	public int at (int Position)
	{
		if(Position > size || Position < 0)
		{
			return -1;
		}
		else
		{
			for(int i =0; i < Position; i++)
			{
				head = head.next;
			}
			return head.Get_Data();
		}
	}
	/**
	 * Deletes the node at the position asked by the user. If it is too big
	 * it returns an out of bounds error
	 * 
	 * @param Position  The potential position where its located in the linked list.
	 */
	public void delete (int Position)
	{
		if(Position > size || Position < 0)
		{
			System.out.println("Your input was invalid");
		}
		else
		{
			size -= 1;
			if(size == 0)
			{
				
				head =  null;
				return;
			}
			for(int i =0; i < Position-1; i++)
			{	
				head = head.next;
			}
			head.next = head.next.next;
		}
	}
	/**
	 * Pops the data at the end of the linked list
	 * @return popped_data This is the data that is from the popped node
	 */
	public int pop()
	{
		int popped_data;
		node next_node = null;
		if(size ==1)
		{
			popped_data = head.Get_Data();
			head = null;
			return popped_data;
		}
		else
		{
			next_node = head;
			for(int i =0; i < size-2; i++)
			{
				next_node = next_node.next;
			}
			popped_data = next_node.next.Get_Data();
			next_node.next = null;
			size -= 1;
			return popped_data;
		}
		
	}
	/**
	 * Showcase function is used for a visual representation of what is 
	 * stored in the link list. 
	 */
	public void showcase()
	{
		
		for(int i =0; i<size; i++)
		{
			System.out.print( 	"| " + head.Get_Data() + " |" + "-->");
			head = head.next;
		}
		
	}
}
