package StringOperation;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountUsingHashMap {
	public static void main(String[] args) {
		String str = "AjitA";
		charCount(str);
	}

	private static void charCount(String str) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
