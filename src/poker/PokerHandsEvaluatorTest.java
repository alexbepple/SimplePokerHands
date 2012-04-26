package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PokerHandsEvaluatorTest {

	@Test
	public void findsHighCardInSetOfOneCards() throws Exception {
		assertThat(mostValuableCombinationIn("s7"), is("s7"));
	}
	
	@Test
	public void findsHighCardInSetOfTwoCardsWhenHighCardIsLast() throws Exception {
		assertThat(mostValuableCombinationIn("s7 s8"), is("s8"));
	}
	
	@Test
	public void findsHighCardInSetOfTwoCardsWhenHighCardIsFirst() throws Exception {
		assertThat(mostValuableCombinationIn("s8 s7"), is("s8"));
	}
	
	private String mostValuableCombinationIn(String handAsString) {
		return new Hand(handAsString).mostValuableCombination();
	}
}
