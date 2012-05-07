package poker.core;

public enum Rank {

	two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace;
	
	public static Rank valueOf(int numericValue) {
		return values()[numericValue-2];
	}
	
	public static Rank valueForShorthand(String shorthand) {
		for (Rank rank: values()) {
			if (rank.name().startsWith(shorthand)) return rank;
		}
		return valueOf(Integer.valueOf(shorthand));
	}

	public String shorthand() {
		int value = this.ordinal() + 2;
		if (value <= 10) return "" + value;
		return this.name().substring(0, 1);
	}
}
