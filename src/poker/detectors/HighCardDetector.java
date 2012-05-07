package poker.detectors;

import java.util.Collections;
import java.util.List;

import poker.core.Card;
import poker.core.HandRankDetector;

public class HighCardDetector implements HandRankDetector {

	public static Card highCard(List<Card> cards) {
		return Collections.max(cards);
	}

	public String describeHandRank(List<Card> cards) {
		return "High card: " + HighCardDetector.highCard(cards);
	}

	@Override
	public boolean appliesTo(List<Card> cards) {
		return cards.size() > 0;
	}
}
