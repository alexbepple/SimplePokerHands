package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static poker.Value.jack;
import static poker.Value.valueForShorthand;

import org.junit.Test;

public class NonnumericValueTest {

	@Test
	public void canBeCreatedFromShorthand() throws Exception {
		assertThat(valueForShorthand("j"), is(jack));
	}
	
	@Test
	public void usesInitialLetterAsShorthand() throws Exception {
		assertThat(jack.shorthand(), is("j"));
	}
}
