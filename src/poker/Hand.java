package poker;

import static poker.CollectionUtils.countOccurrences;
import static poker.CollectionUtils.join;

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
		if (containsPair(cards))
			return "Pair: " + join(cards, ", ");
		return "High card: " + highCard();
	}

	private boolean containsPair(List<Card> cards) {
		return countOccurrences(values(cards)).containsValue(2);
	}

	private List<Value> values(List<Card> cards) {
		List<Value> values = new ArrayList<Value>();
		for (Card card: cards) {
			values.add(card.value());
		}
		return values;
	}

	private Card highCard() {
		return Collections.max(cards);
	}

}
