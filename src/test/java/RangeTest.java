import static org.junit.Assert.*;

import org.junit.Test;

import demo.InvalidRangeArgumentException;
import demo.Range;


public class RangeTest {

	@Test(expected = InvalidRangeArgumentException.class)
	public void invalidRange() {
		String input = "2,5";
		new Range(input);
	}
	
	@Test
	public void StartAndEndShouldHaveInclusive() throws Exception {
		String input = "[2,5]";
		Range range = new Range(input);
		assertTrue(range.isInclusiveStart());
		assertTrue(range.isInclusiveEnd());
	}
	
	@Test
	public void StartAndEndShouldHaveExclusive() throws Exception {
		String input = "(2,5)";
		Range range = new Range(input);
		assertFalse(range.isInclusiveStart());
		assertFalse(range.isInclusiveEnd());
	}
	
	@Test
	public void ForInclusiveTwoAndFiveShouldStartWithTwoAndEndWithFive() throws Exception {
		String input = "[2,5]";
		Range range = new Range(input);
		assertEquals("2", range.getStart());
		assertEquals("5", range.getEnd());
	}

}
