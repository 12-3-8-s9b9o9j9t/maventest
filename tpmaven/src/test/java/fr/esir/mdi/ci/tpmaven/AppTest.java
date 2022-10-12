package fr.esir.mdi.ci.tpmaven;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	int[]t;
	@Before
	public void setUp() {
		t = new int[15];
		for (int i=0; i<t.length; i++) {
			t[i] = 3%(i+1);
		}
	}
	
	@Test
	public void rigourousTest() {
		assertTrue(true);
	}
	
	@Test
	public void sum0() {
		assertEquals(0.0f, App.sum(0.0f,0.0f), 0);
	}
	
	@Test
	public void sum1() {
		assertEquals(0.3f, App.sum(0.1f,0.2f), 0);
	}
	
	@Test
	public void esttrie0() {
		assertFalse(App.estTrie(t));
	}
}
