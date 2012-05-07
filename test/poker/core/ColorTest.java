package poker.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import poker.core.Color;

public class ColorTest {

	@Test
	public void canBeCreatedFromShorthand() throws Exception {
		assertThat(Color.valueForShorthand("s"), is(Color.spades));
	}
}
