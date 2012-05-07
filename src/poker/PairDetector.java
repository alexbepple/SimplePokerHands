package poker;

import static poker.Card.filterByValue;
import static poker.Card.values;
import static poker.CollectionUtils.countOccurrences;
import static poker.CollectionUtils.join;

import java.util.List;
import java.util.Map;

public class PairDetector implements CombinationDetector {

	@Override
	public boolean appliesTo(List<Card> cards) {
		return countOccurrences(values(cards)).containsValue(2);
	}

	private Value valueOfPair(List<Card> cards) {
		Map<Value, Integer> occurrences = countOccurrences(values(cards));
		Value pairValue = null;
		for (Value value : occurrences.keySet()) {
			if (occurrences.get(value) == 2)
				pairValue = value;
		}
		return pairValue;
	}

	public List<Card> findHighest(List<Card> cards) {
		return filterByValue(cards, valueOfPair(cards));
	}

	@Override
	public String describeHighest(List<Card> cards) {
		return "Pair: " + join(findHighest(cards), ", ");
	}

}
