package poker;

import java.util.Collections;
import java.util.List;

public class HighCardDetector {

	public static Card highCard(List<Card> cards) {
		return Collections.max(cards);
	}

	public String describeHighest(List<Card> cards) {
		return "High card: " + HighCardDetector.highCard(cards);
	}

}
