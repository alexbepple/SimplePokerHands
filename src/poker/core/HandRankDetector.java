package poker.core;

import java.util.List;

public interface HandRankDetector {

	boolean appliesTo(List<Card> cards);

	String describeHandRank(List<Card> cards);

}