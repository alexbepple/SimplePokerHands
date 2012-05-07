package poker.detectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static poker.core.Card.clubs;
import static poker.core.Card.diamonds;
import static poker.core.Cards.cards;

import java.util.List;

import org.junit.Test;

import poker.core.Card;

public class PairDetectorTest {

	private PairDetector detector = new PairDetector();

	@Test
	public void findsPairInSetOfTwoCards() throws Exception {
		List<Card> pair = cards(clubs(2), diamonds(2));
		assertTrue(detector.appliesTo(pair));
		assertThat(detector.findPair(pair), is(pair));
	}
	
	@Test
	public void findsPairInSetOfThreeCards() throws Exception {
		List<Card> hand = cards(clubs(2), diamonds(2), clubs(3));
		List<Card> containedPair = cards(clubs(2), diamonds(2));
		assertTrue(detector.appliesTo(hand));
		assertThat(detector.findPair(hand), is(containedPair));
	}

}
