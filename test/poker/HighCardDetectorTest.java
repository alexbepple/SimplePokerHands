package poker;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static poker.Card.clubs;

import org.junit.Test;

public class HighCardDetectorTest {

	@Test
	public void findsCardWithHighestValue() throws Exception {
		assertThat(HighCardDetector.highCard(asList(clubs(6), clubs(7), clubs(5))), is(clubs(7)));
	}
}
