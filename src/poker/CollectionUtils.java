package poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUtils {

	public static String join(Collection<? extends Object> collection, String separator) {
		List<Object> interleaved = interleave(collection, separator);
		return join(interleaved);
	}

	private static List<Object> interleave(
			Collection<? extends Object> collection, String separator) {
		List<Object> interleaved = new ArrayList<Object>();
		for (Object object: collection) {
			interleaved.add(object);
			interleaved.add(separator);
		}
		interleaved.remove(interleaved.size()-1);
		return interleaved;
	}

	private static String join(List<? extends Object> collection) {
		StringBuilder result = new StringBuilder();
		for (Object object: collection)
			result.append(object.toString());
		return result.toString();
	}

}
