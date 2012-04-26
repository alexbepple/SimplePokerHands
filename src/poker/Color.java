package poker;

public enum Color {

	spades, hearts, clubs, diamonds;

	public static Color valueForShorthand(String string) {
		for (Color color: values())
			if (color.name().startsWith(string)) return color;
		return null;
	}
	
	public String shorthand() {
		return name().substring(0, 1);
	}
}
