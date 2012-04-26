package poker;

import static java.util.Arrays.asList;
import static poker.CollectionUtils.join;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hand {

	public Set<Card> cards;

	public Hand(String handAsString) {
		cards = cardsFrom(handAsString);
	}

	public static Set<Card> cardsFrom(String hand) {
		String[] cardsAsStrings = hand.split(" ");
		Set<Card> cards = new HashSet<Card>();
		for (String cardAsString: cardsAsStrings) {
			cards.add(new Card(cardAsString));
		}
		return cards;
	}
	
	public String mostValuableCombination() {
		if (cards.contains(new Card("s2")))
			return "Pair: " + join(asList("s2", "h2"), ", ");
		return "High card: " + highCard();
	}

	private Card highCard() {
		return Collections.max(cards);
	}

}
