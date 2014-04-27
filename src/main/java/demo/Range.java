package demo;

public class Range {

	private String end;
	private String start;
	private String input;

	public Range(String input) {
		if ((input.startsWith("[") || input.startsWith("(")) 
				&& (input.endsWith("]") || input.endsWith(""))) {
			this.input = input;
			setStart(String.valueOf(input.charAt(1)));
			setEnd(String.valueOf(input.charAt(input.length()-2)));

		} else {
			throw new InvalidRangeArgumentException();
		}
	}

	private void setEnd(String end) {
		this.end = end;
	}

	private void setStart(String start) {
		this.start = start;
	}

	public boolean isInclusiveStart() {
		if(this.input.startsWith("(")) {
			return false;
		}
		return true;
	}

	public boolean isInclusiveEnd() {
		if(this.input.endsWith(")")) {
			return false;
		}
		return true;
	}

	public String getStart() {
		return this.start;
	}

	public String getEnd() {
		return this.end;
	}

}
