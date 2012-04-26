package poker;

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
		return Collections.max(cards).toString();
	}

}
