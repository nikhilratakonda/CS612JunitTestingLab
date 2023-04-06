package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideNegativeTest {

	@Test
	void test() {
JunitTesting junit = new JunitTesting();

// Positive test
//double output =  junit.divide(10, 2);
//assertEquals( 5 , output);
		
		// Negative test
		double output =  junit.divide(10, 2);
		assertEquals( 6 , output);
	}

}
