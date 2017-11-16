import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplemtationTest {
	private Implementation obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testAdd() {
		long ans = 5 + (-3) + 21 + (-18);
		assertEquals(ans, obj.add(5, -3, 21, -18));
		
		ans = 15 + (-49);
		assertEquals(ans, obj.add(15, -49));
		
		ans = 8;
		assertEquals(ans, obj.add(8));
	}
	@Test
	public void testSubtract() {
		long ans = 327 - 498 - (-47) - 32;
		assertEquals(ans, obj.subtract(327, 498, -47, 32));
		
		ans = 798 - 450;
		assertEquals(ans, obj.subtract(798,450));
	}
}
