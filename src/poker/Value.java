package poker;

public enum Value {

	two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace;
	
	public static Value valueOf(int numericValue) {
		return values()[numericValue-2];
	}
	
	public static Value valueForShorthand(String shorthand) {
		for (Value value: values()) {
			if (value.name().startsWith(shorthand)) return value;
		}
		return valueOf(Integer.valueOf(shorthand));
	}

	public String shorthand() {
		int value = this.ordinal() + 2;
		if (value <= 10) return "" + value;
		return this.name().substring(0, 1);
	}
}
