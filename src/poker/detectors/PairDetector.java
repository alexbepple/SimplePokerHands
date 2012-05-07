package poker.detectors;

import static poker.core.Cards.filterByRank;
import static poker.core.Cards.ranks;
import static util.CollectionUtils.countOccurrences;
import static util.CollectionUtils.join;

import java.util.List;
import java.util.Map;

import poker.core.Card;
import poker.core.HandRankDetector;
import poker.core.Rank;

public class PairDetector implements HandRankDetector {

	@Override
	public boolean appliesTo(List<Card> cards) {
		return countOccurrences(ranks(cards)).containsValue(2);
	}

	private Rank rankOfPair(List<Card> cards) {
		Map<Rank, Integer> occurrences = countOccurrences(ranks(cards));
		for (Rank rank : occurrences.keySet()) {
			if (occurrences.get(rank) == 2)
				return rank;
		}
		return null;
	}

	public List<Card> findPair(List<Card> cards) {
		return filterByRank(cards, rankOfPair(cards));
	}

	@Override
	public String describeHandRank(List<Card> cards) {
		return "Pair: " + join(findPair(cards), ", ");
	}

}
