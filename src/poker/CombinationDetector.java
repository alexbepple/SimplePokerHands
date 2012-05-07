package poker;

import java.util.List;

public interface CombinationDetector {

	boolean appliesTo(List<Card> cards);

	String describeHighest(List<Card> cards);

}