public class DuplicateEncoder {
	static String encode(String word) {
		String lowerWord = word.toLowerCase();
		return lowerWord.chars().mapToObj(letter -> lowerWord.chars().filter(l -> l == letter).count() == 1 ? '(' : ')')
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
	}
}
