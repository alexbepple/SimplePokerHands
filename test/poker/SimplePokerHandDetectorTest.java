package poker;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import poker.core.HandRankDetector;
import poker.core.Hand;
import poker.detectors.HighCardDetector;
import poker.detectors.PairDetector;

public class SimplePokerHandDetectorTest {

	@Test
	public void findsHighCard() throws Exception {
		assertThat(highestHandRank("s2 h3 d7 h4 s5"), is("High card: d7"));
	}
	@Test
	public void findsPair() throws Exception {
		assertThat(highestHandRank("s2 h2 s3 s4 s5"), is("Pair: s2, h2"));
	}
	
	private String highestHandRank(String handAsString) {
		List<HandRankDetector> detectors = asList(new PairDetector(), new HighCardDetector());
		return new Hand(handAsString, detectors).highestHandRank();
	}

}
