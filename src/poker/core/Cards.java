package poker.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {

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
