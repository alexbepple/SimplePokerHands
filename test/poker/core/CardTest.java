package poker.core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static poker.core.Card.clubs;
import static poker.core.Card.diamonds;
import static poker.core.Color.clubs;
import static poker.core.Value.two;

import org.junit.Test;

import poker.core.Card;

public class CardTest {

	@Test
	public void comparesToOtherCardsOnlyByValue() throws Exception {
		assertTrue(clubs(3).compareTo(diamonds(2)) > 0);
		assertTrue(diamonds(2).compareTo(clubs(3)) < 0);
	}
	
	@Test
	public void tenIsGreaterThanNine() throws Exception {
		assertThat(clubs(10), is(greaterThan(clubs(9))));
	}
	
	@Test
	public void jackIsGreaterThanTen() throws Exception {
		assertThat(new Card("dj"), is(greaterThan(clubs(10))));
	}
	
	@Test
	public void equalsAnotherCardOfSameColorAndValue() throws Exception {
		assertThat(new Card(clubs, two), is(equalTo(clubs(2))));
	}
}
