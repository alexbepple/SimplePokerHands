package poker.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {

	public static List<Card> cards(Card... cards) {
		return Arrays.asList(cards);
	}

	public static List<Card> filterByRank(List<Card> cards, Rank rank) {
		List<Card> matchingCards = new ArrayList<Card>();
		for (Card card : cards) {
			if (card.rank() == rank) {
				matchingCards.add(card);
			}
		}
		return matchingCards;
	}

	public static List<Rank> ranks(List<Card> cards) {
		List<Rank> ranks = new ArrayList<Rank>();
		for (Card card: cards) {
			ranks.add(card.rank());
		}
		return ranks;
	}

}
