package poker;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static poker.CollectionUtils.countOccurrences;

import java.util.Arrays;

import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void joinsElementsOfCollectionUsingSeparator() throws Exception {
		assertThat(CollectionUtils.join(Arrays.asList(1, 2), ", "), is("1, 2"));
	}
	
	@Test
	public void countsElementsOfCollectionWhenElementsOccurOnce() throws Exception {
		assertThat(countOccurrences(asList(1)), hasEntry(1, 1));
	}
	
	@Test
	public void countsElementsOfCollectionWhenElementsOccurMultipleTimes() throws Exception {
		assertThat(countOccurrences(asList(1, 1)), hasEntry(1, 2));
	}
}
