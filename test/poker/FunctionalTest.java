package poker;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import poker.core.CombinationDetector;
import poker.core.Hand;
import poker.detectors.HighCardDetector;
import poker.detectors.PairDetector;

public class FunctionalTest {

	@Test
	public void findsPairInSetOfThreeCards() throws Exception {
		assertThat(mostValuableCombinationIn("s2 h2 s3"), is("Pair: s2, h2"));
	}
	
	private String mostValuableCombinationIn(String handAsString) {
		List<CombinationDetector> detectors = asList(new PairDetector(), new HighCardDetector());
		return new Hand(handAsString, detectors).mostValuableCombination();
	}

}
