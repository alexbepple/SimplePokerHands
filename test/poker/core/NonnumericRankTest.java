package poker.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static poker.core.Rank.jack;
import static poker.core.Rank.valueForShorthand;

import org.junit.Test;

public class NonnumericRankTest {

	@Test
	public void canBeCreatedFromShorthand() throws Exception {
		assertThat(valueForShorthand("j"), is(jack));
	}
	
	@Test
	public void usesInitialLetterAsShorthand() throws Exception {
		assertThat(jack.shorthand(), is("j"));
	}
}
