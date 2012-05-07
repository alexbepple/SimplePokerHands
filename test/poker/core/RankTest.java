package poker.core;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RankTest {

	@Test
	public void tenIsGreaterThanNine() throws Exception {
		assertThat(Rank.valueOf(10), is(greaterThan(Rank.valueOf(9))));
	}
	
	@Test
	public void jackIsGreaterThanTen() throws Exception {
		assertThat(Rank.valueForShorthand("j"), is(greaterThan(Rank.valueOf(10))));
	}
}
