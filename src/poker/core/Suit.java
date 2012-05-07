package poker.core;

public enum Suit {

	spades, hearts, clubs, diamonds;

	public static Suit valueForShorthand(String string) {
		for (Suit suit: values())
			if (suit.name().startsWith(string)) return suit;
		return null;
	}
	
	public String shorthand() {
		return name().substring(0, 1);
	}
}
