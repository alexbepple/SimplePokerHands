package poker.core;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class HandTest {
	
	@Test
	public void canBeEmpty() throws Exception {
		new Hand("", null);
	}
	
	@Test
	public void usesFirstApplicableDetectorInOrderToFindHighestHandRank() throws Exception {
		List<HandRankDetector> detectors = 
				asList(applicableDetector("foo"), applicableDetector("bar"));
		assertThat(new Hand("", detectors).highestHandRank(), is("foo"));
	}
	
	@Test(expected = NoApplicableHandRankException.class)
	public void indicatesWhenNoApplicableDetectorFound() throws Exception {
		new Hand("", Collections.<HandRankDetector> emptyList()).highestHandRank();
	}

	private HandRankDetector applicableDetector(String rankDescription) {
		HandRankDetector detector = mock(HandRankDetector.class);
		when(detector.appliesTo(anyListOf(Card.class))).thenReturn(true);
		when(detector.describeHandRank(anyListOf(Card.class))).thenReturn(rankDescription);
		return detector;
	}
}
