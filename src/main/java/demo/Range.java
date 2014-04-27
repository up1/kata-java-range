package demo;

public class Range {

	private String end;
	private String start;

	public Range(String input) {
		if ((input.startsWith("[") || input.startsWith("(")) 
				&& (input.endsWith("]") || input.endsWith(""))) {
			setStart(String.valueOf(input.charAt(0)));
			setEnd(String.valueOf(input.charAt(input.length()-1)));

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
		if(this.start.equals("(")) {
			return false;
		}
		return true;
	}

	public boolean isInclusiveEnd() {
		if(this.end.equals(")")) {
			return false;
		}
		return true;
	}

}
