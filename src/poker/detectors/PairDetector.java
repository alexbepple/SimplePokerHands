package poker.detectors;

import static poker.core.Cards.filterByValue;
import static poker.core.Cards.values;
import static util.CollectionUtils.countOccurrences;
import static util.CollectionUtils.join;

import java.util.List;
import java.util.Map;

import poker.core.Card;
import poker.core.CombinationDetector;
import poker.core.Value;

public class PairDetector implements CombinationDetector {

	@Override
	public boolean appliesTo(List<Card> cards) {
		return countOccurrences(values(cards)).containsValue(2);
	}

	private Value valueOfPair(List<Card> cards) {
		Map<Value, Integer> occurrences = countOccurrences(values(cards));
		for (Value value : occurrences.keySet()) {
			if (occurrences.get(value) == 2)
				return value;
		}
		return null;
	}

	public List<Card> findHighest(List<Card> cards) {
		return filterByValue(cards, valueOfPair(cards));
	}

	@Override
	public String describeHighest(List<Card> cards) {
		return "Pair: " + join(findHighest(cards), ", ");
	}

}
