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
	public void usesFirstApplicableDetectorInOrderToFindMostValuableCombination() throws Exception {
		List<CombinationDetector> detectors = 
				asList(applicableDetector("foo"), applicableDetector("bar"));
		assertThat(new Hand("", detectors).mostValuableCombination(), is("foo"));
	}
	
	@Test(expected = NoApplicableDetectorException.class)
	public void indicatesWhenNoApplicableDetectorFound() throws Exception {
		new Hand("", Collections.<CombinationDetector> emptyList()).mostValuableCombination();
	}

	private CombinationDetector applicableDetector(String combinationDescription) {
		CombinationDetector detector = mock(CombinationDetector.class);
		when(detector.appliesTo(anyListOf(Card.class))).thenReturn(true);
		when(detector.describeHighest(anyListOf(Card.class))).thenReturn(combinationDescription);
		return detector;
	}
}
