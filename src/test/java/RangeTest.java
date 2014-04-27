import static org.junit.Assert.*;

import org.junit.Test;

import demo.InvalidRangeArgumentException;
import demo.Range;


public class RangeTest {

	@Test(expected = InvalidRangeArgumentException.class)
	public void invalidRange() {
		String input = "2,5";
		Range range = new Range(input);
	}

}
