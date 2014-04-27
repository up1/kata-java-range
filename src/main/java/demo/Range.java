package demo;

public class Range {

	public Range(String input) {
		if (input.startsWith("[") && input.endsWith("]")) {

		} else {
			throw new InvalidRangeArgumentException();
		}
	}

	public boolean isInclusiveStart() {
		return true;
	}

	public boolean isInclusiveEnd() {
		return true;
	}

}
