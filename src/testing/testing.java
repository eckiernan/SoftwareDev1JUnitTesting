package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testing {

	@Test
	public void test() {
		JUnitTest test = new JUnitTest();
		int output = test.calculation(4, 6, 10, 11);
		assertEquals(25, output);
	}

}
