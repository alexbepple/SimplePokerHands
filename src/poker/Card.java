package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	public Value value() {
		return this.value;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return color == other.color && value == other.value;
	}

	public static List<Card> cards(Card... cards) {
		return Arrays.asList(cards);
	}

	public static List<Card> filterByValue(List<Card> cards, Value value) {
		List<Card> matchingCards = new ArrayList<Card>();
		for (Card card : cards) {
			if (card.value() == value) {
				matchingCards.add(card);
			}
		}
		return matchingCards;
	}

	public static List<Value> values(List<Card> cards) {
		List<Value> values = new ArrayList<Value>();
		for (Card card: cards) {
			values.add(card.value());
		}
		return values;
	}
	
	
}
