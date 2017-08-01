import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	@Before
	public void setUp() throws Exception {
	}
	/**
	 * Tests the at method to see if the location is right at 0
	 */
	@Test
	public void Test_Linked_List_At_0() {
		int value = 3;
		LinkedList test = new LinkedList(value);
		assertEquals(value, test.at(0));
	}
	/**
	 * Tests the append method
	 */
	@Test
	public void Test_Linked_List_Append() {
		int value = 3;
		LinkedList test = new LinkedList(value);
		test.append(11);
		test.append(12);

		value = 12;

		assertEquals(3, test.getSize());
	}
	/**
	 * Tests the delete function
	 */
	@Test
	public void Test_Linked_List_Delete() {
		int value = 3;
		
		LinkedList test = new LinkedList(value);
		test.append(4);
		test.append(5);
		test.delete(2);
		int size = test.getSize();
		assertEquals(2, size);
	}
	/**
	 * tests the pop function
	 */
	@Test
	public void Test_Linked_List_Pop() {
		int value = 3;
		LinkedList test = new LinkedList(value);
		test.append(4);
		test.append(5);
		value = test.pop();
		assertEquals(value, 5);
	}
	@Test
	public void Test_Linked_List_Pop_With_One_Element() {
		int value = 3;
		LinkedList test = new LinkedList(value);

		value = test.pop();
		assertEquals(value, 3);
	}
	/**
	 * Tests the show case function, used to debug the visuals
	 */
	@Test
	public void Test_Linked_List_Showcase() {
		int value = 3;
		LinkedList test = new LinkedList(value);
		test.append(5);
		test.showcase();
		assertTrue(true);
	}
	/**
	 * Tests at method after multiple insertions
	 */
	@Test
	public void Test_Linked_List_At_Multiple_Insertions() {
		int value = 3;
		LinkedList test = new LinkedList(value);
		test.append(5);
		test.append(2);
		assertEquals(2, test.at(2));
	}
	/**
	 * Tests delete at other positions
	 */
	@Test
	public void Test_Linked_List_Delete_At_0() {
		int value = 3;
		LinkedList test = new LinkedList(value);
		test.delete(0);
		assertEquals(0, test.getSize());
	}
	
	
}
