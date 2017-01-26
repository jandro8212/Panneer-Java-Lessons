package testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup before the Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down after the Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down");
	}

	@Test
	public void testAdd() {
		System.out.println("Test 1");
		calculator c = new calculator();
		double sum = c.add(2, 3);
		Assert.assertEquals(5, sum, 0);
	}
	
	@Test
	public void testSub() {
		System.out.println("Test 2");
		calculator c = new calculator();
		double result = c.sub(3, 2);
		Assert.assertEquals(1, result, 0);
	}

}
