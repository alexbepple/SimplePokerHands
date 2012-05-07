package poker.core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static poker.core.Card.clubs;
import static poker.core.Card.diamonds;
import static poker.core.Rank.two;
import static poker.core.Suit.clubs;

import org.junit.Test;

public class CardTest {

	@Test
	public void comparesToOtherCardsOnlyByRank() throws Exception {
		assertTrue(clubs(3).compareTo(diamonds(2)) > 0);
		assertTrue(diamonds(2).compareTo(clubs(3)) < 0);
	}
		
	@Test
	public void equalsAnotherCardOfSameSuitAndRank() throws Exception {
		assertThat(new Card(clubs, two), is(equalTo(clubs(2))));
	}
}
