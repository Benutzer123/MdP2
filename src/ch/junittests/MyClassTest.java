package ch.junittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {
	
	MyClass mClass = new MyClass();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testIsEmpty() {
		assertFalse(false);
	}

	@Test
	public final void testCapitalize() {
		assertEquals(mClass.capitalize("hello"), "Hello");
		
	}


	@Test
	public final void testReverse() {
		assertEquals(mClass.reverse("ole"), "elo");
	}

	@Test
	public final void testJoin() {
		String[] myArray = new String[2];
		myArray[0]= "Hello";
		myArray[1]= "World";
		assertEquals(mClass.join(myArray),"Hello World");
	}

}
