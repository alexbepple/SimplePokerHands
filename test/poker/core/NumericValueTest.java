package poker.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static poker.core.Value.ten;
import static poker.core.Value.two;
import static poker.core.Value.valueForShorthand;
import static poker.core.Value.valueOf;

import org.junit.Test;

public class NumericValueTest {

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
