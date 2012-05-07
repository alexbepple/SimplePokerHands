package poker;


import java.util.ArrayList;
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
		HighCardDetector highCardDetector = new HighCardDetector();
		PairDetector pairDetector = new PairDetector();
		if (pairDetector.appliesTo(cards)) {
			return pairDetector.describeHighest(cards);
		}
		return highCardDetector.describeHighest(cards);
	}

}
