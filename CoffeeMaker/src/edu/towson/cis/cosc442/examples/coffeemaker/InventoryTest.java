package edu.towson.cis.cosc442.examples.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/27/18 12:09 AM
 * @author richieawojoodu
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15Milk: 15\nSugar: 15\nChocolate: 15\n", result.toString());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = -1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = 1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = -1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = 1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = new Inventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15Milk: 15\nSugar: 15\nChocolate: 15\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/27/18 12:09 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}