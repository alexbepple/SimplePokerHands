package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

// Smells:
// shorthands for cards
// repetition of "High card: "

// What about the order of cards in a pair?
// What about two pairs?
public class HandTest {
	
	@Test
	public void findsPairInSetOfThreeCards() throws Exception {
		assertThat(mostValuableCombinationIn("s2 h2 s3"), is("Pair: s2, h2"));
	}
	
	private String mostValuableCombinationIn(String handAsString) {
		return new Hand(handAsString).mostValuableCombination();
	}
}
