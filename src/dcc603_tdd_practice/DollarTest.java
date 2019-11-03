package dcc603_tdd_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
	    five.times(2);
	    assertEquals(10, five.amount);
    }
}