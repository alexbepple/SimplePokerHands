package poker.core;


public class Card implements Comparable<Card> {

	private Rank rank;
	private Suit suit;

	public Card(String representation) {
		suit = Suit.valueForShorthand(representation.substring(0, 1));
		rank = Rank.valueForShorthand(representation.substring(1));
	}
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Rank rank() {
		return this.rank;
	}
	
	@Override
	public String toString() {
		return "" + suit.shorthand() + rank.shorthand();
	}
	
	public int compareTo(Card other) {
		return this.rank.compareTo(other.rank);
	}

	public static Card diamonds(int numericRank) {
		return new Card(Suit.diamonds, Rank.valueOf(numericRank));
	}

	public static Card clubs(int numericRank) {
		return new Card(Suit.clubs, Rank.valueOf(numericRank));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
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
		return suit == other.suit && rank == other.rank;
	}
}
