package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

// Smells:
// shorthands for cards
// repetition of "High card: "
public class HandTest {

	@Test
	public void findsHighCardInSetOfOneCards() throws Exception {
		assertThat(mostValuableCombinationIn("s7"), is("High card: s7"));
	}

	@Test
	public void findsHighCardInSetOfTwoCardsWhenHighCardIsLast() throws Exception {
		assertThat(mostValuableCombinationIn("s7 s8"), is("High card: s8"));
	}

	@Test
	public void findsHighCardInSetOfTwoCardsWhenHighCardIsFirst() throws Exception {
		assertThat(mostValuableCombinationIn("s8 s7"), is("High card: s8"));
	}
	
	@Test
	public void findsPairInSetOfTwoCards() throws Exception {
		assertThat(mostValuableCombinationIn("s2 h2"), is("Pair: s2, h2"));
	}
	
	private String mostValuableCombinationIn(String handAsString) {
		return new Hand(handAsString).mostValuableCombination();
	}
}
