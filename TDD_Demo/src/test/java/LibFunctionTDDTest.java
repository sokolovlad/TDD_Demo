import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibFunctionTDDTest {
	LibFunctionTDD lt;
	int libcardno,noofbooks;
	long isdn;

	@Before
	public void setUp() throws Exception {
		lt = new LibFunctionTDD();
		libcardno = 123456;
		noofbooks = 7;
		isdn=7608768l;
		
	}

	@After
	public void tearDown() throws Exception {
		lt = null;
		libcardno = -1;
		noofbooks = -1;
	}

	@Test
	public void testLibCardNoExist() {
		int libcardno =123456 ;
		assertEquals(true, lt.isvalid(libcardno));
				
	}
	
	@Test
	public void testNoOfBooks() {
		int noofbooks =7;
		assertEquals(noofbooks, lt.noofbooks());
		
		
	}
	
	@Test
	public void BooksExists() {
		long isdn =7608768l;
		assertEquals(true, lt.bookExists(isdn));
		
	}
		
}
