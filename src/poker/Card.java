package poker;

public class Card implements Comparable<Card> {

	private Value value;
	private Color color;

	public Card(String representation) {
		color = Color.valueForShorthand(representation.substring(0, 1));
		value = Value.valueForShorthand(representation.substring(1));
	}
	
	public Card(Color color, Value value) {
		this.color = color;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "" + color.shorthand() + value.shorthand();
	}
	
	public int compareTo(Card other) {
		return this.value.compareTo(other.value);
	}

	public static Card diamonds(int numericValue) {
		return new Card(Color.diamonds, Value.valueOf(numericValue));
	}

	public static Card clubs(int numericValue) {
		return new Card(Color.clubs, Value.valueOf(numericValue));
	}
}
