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

}
