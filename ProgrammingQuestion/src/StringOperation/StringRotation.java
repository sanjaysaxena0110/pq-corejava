package StringOperation;

public class StringRotation {
	public static void main(String[] args) {
		/*
		 * Anti-Clockwise by two places input amazon output azonam
		 */

		String word = "amazon";
		int shift = 2;
		System.out.println("Actual String=>" + word);
		String result = clockwiseRotation(word, shift);
		System.out.println("Clockwise result=>" + result);
		String antiResult = anticlockwiseRotation(word, shift);
		System.out.println("AntiClockwise result=>" + antiResult);
	}

	/**
	 * 
	 * @param word
	 * @param shift
	 * @return
	 */
	private static String clockwiseRotation(String word, int shift) {
		String firstPart = word.substring(0, shift);
		String secondPart = word.substring(shift, word.length());
		return secondPart + firstPart;
	}

	/**
	 * 
	 * @param word
	 * @param shift
	 * @return
	 */
	private static String anticlockwiseRotation(String word, int shift) {
		String firstPart = word.substring(word.length() - shift, word.length());
		String secondPart = word.substring(0, word.length() - shift);
		return firstPart + secondPart;
	}
}
