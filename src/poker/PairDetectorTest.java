package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static poker.Card.cards;
import static poker.Card.clubs;
import static poker.Card.diamonds;

import java.util.List;

import org.junit.Test;

public class PairDetectorTest {

	private PairDetector detector = new PairDetector();

	@Test
	public void findsPairInSetOfTwoCards() throws Exception {
		List<Card> pair = cards(clubs(2), diamonds(2));
		assertTrue(detector.appliesTo(pair));
		assertThat(detector.findHighest(pair), is(pair));
	}
	
	@Test
	public void findsPairInSetOfThreeCards() throws Exception {
		List<Card> hand = cards(clubs(2), diamonds(2), clubs(3));
		List<Card> containedPair = cards(clubs(2), diamonds(2));
		assertTrue(detector.appliesTo(hand));
		assertThat(detector.findHighest(hand), is(containedPair));
	}
	

}
