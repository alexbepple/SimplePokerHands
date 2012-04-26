package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static poker.Value.ten;
import static poker.Value.two;
import static poker.Value.valueForShorthand;
import static poker.Value.valueOf;

import org.junit.Test;

public class NumericValue {

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
