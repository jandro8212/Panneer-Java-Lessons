package exceptions;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class filereaderTest {

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
	public void test() {
		filereader r = new filereader();
		try {
			String file = r.readFile();
			Assert.assertEquals("Hola", file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
