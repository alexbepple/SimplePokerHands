package poker;


import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> cards;
	private List<CombinationDetector> combinationDetectors;

	public Hand(String handAsString, List<CombinationDetector> combinationDetectors) {
		this.cards = cardsFrom(handAsString);
		this.combinationDetectors = combinationDetectors;
	}

	private static List<Card> cardsFrom(String hand) {
		if ("".equals(hand)) return new ArrayList<Card>();
		
		String[] cardsAsStrings = hand.split(" ");
		List<Card> cards = new ArrayList<Card>();
		for (String cardAsString: cardsAsStrings) {
			cards.add(new Card(cardAsString));
		}
		return cards;
	}
	
	public String mostValuableCombination() {
		for (CombinationDetector combinationDetector : combinationDetectors) {
			if (combinationDetector.appliesTo(cards))
				return combinationDetector.describeHighest(cards);
		}
		throw new NoApplicableDetectorException();
	}

}
