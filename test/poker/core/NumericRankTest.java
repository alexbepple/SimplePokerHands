package poker.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static poker.core.Rank.ten;
import static poker.core.Rank.two;
import static poker.core.Rank.valueForShorthand;
import static poker.core.Rank.valueOf;

import org.junit.Test;

public class NumericRankTest {

	@Test
	public void canBeCreatedFromNumber() throws Exception {
		assertThat(valueOf(10), is(ten));
	}
	
	@Test
	public void canBeCreatedFromString() throws Exception {
		assertThat(valueForShorthand("10"), is(ten));
	}
	
	@Test
	public void usesNumberAsShorthand() throws Exception {
		assertThat(two.shorthand(), is("2"));
	}
}
