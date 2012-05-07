package poker.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import poker.core.Suit;

public class SuitTest {

	@Test
	public void canBeCreatedFromShorthand() throws Exception {
		assertThat(Suit.valueForShorthand("s"), is(Suit.spades));
	}
}
