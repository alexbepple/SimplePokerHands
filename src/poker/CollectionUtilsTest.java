package poker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void joinsElementsOfCollectionUsingSeparator() throws Exception {
		assertThat(CollectionUtils.join(Arrays.asList(1, 2), ", "), is("1, 2"));
	}
}
