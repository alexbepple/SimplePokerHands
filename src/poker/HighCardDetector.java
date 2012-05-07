package poker;

import java.util.Collections;
import java.util.List;

public class HighCardDetector implements CombinationDetector {

	public static Card highCard(List<Card> cards) {
		return Collections.max(cards);
	}

	public String describeHighest(List<Card> cards) {
		return "High card: " + HighCardDetector.highCard(cards);
	}

	@Override
	public boolean appliesTo(List<Card> cards) {
		return cards.size() > 0;
	}
}
