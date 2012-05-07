package poker;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

	public List<Card> cards;

	public Hand(String handAsString) {
		cards = cardsFrom(handAsString);
	}

	private static List<Card> cardsFrom(String hand) {
		String[] cardsAsStrings = hand.split(" ");
		List<Card> cards = new ArrayList<Card>();
		for (String cardAsString: cardsAsStrings) {
			cards.add(new Card(cardAsString));
		}
		return cards;
	}
	
	public String mostValuableCombination() {
		if (Pair.isIn(cards)) {
			return Pair.describeHighest(cards);
		}
		return describeHighCard(cards);
	}

	private String describeHighCard(List<Card> cards) {
		return "High card: " + highCard(cards);
	}

	private Card highCard(List<Card> cards) {
		return Collections.max(cards);
	}

}
