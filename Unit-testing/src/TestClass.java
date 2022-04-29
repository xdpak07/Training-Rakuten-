import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	@Test
	public void testAdd() {
		Mathematics mathematics = new Mathematics();
		int result = mathematics.add(20, 10);
		assertEquals(30, result);
		
		int result1 = mathematics.substract(20, 10);
		assertEquals(10, result1);
	}

	


}
