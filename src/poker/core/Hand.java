package poker.core;


import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> cards;
	private List<HandRankDetector> handRankDetectors;

	public Hand(String handAsString, List<HandRankDetector> handRankDetectors) {
		this.cards = cardsFrom(handAsString);
		this.handRankDetectors = handRankDetectors;
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
	
	public String highestHandRank() {
		for (HandRankDetector detector : handRankDetectors) {
			if (detector.appliesTo(cards))
				return detector.describeHandRank(cards);
		}
		throw new NoApplicableHandRankException();
	}

}
