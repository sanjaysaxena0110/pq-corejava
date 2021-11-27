package StringOperation;

public class ReverseWord {

	public static void main(String[] args) {
		/*
		 * Reverse word and Reverse String with delimiter.
		 */
		/////////////////////////////////////////////////////////////////////////

		String word = "Sanjay Saxena";
		// Expected output: anexaS yajnaS
		StringBuffer sbword = new StringBuffer();
		char words[] = word.toCharArray();
		for (int i = words.length - 1; i >= 0; i--) {
			sbword.append(words[i]);
		}
		System.out.println("Reverse String " + sbword);
		System.out.println("Reverse String using inbuild method " + sbword.reverse()); // Not Working.
		/////////////////////////////////////////////////////////////////////////
		
		String word2 = "i.like.this.program.very.much";
		// Expected output much.very.program.this.like.i
		String words2[] = word2.split("\\."); //Split use regex meta character
		
		sbword = new StringBuffer();
		for (int j = words2.length - 1; j >= 0; j--) {
			sbword.append(words2[j]).append(".");
		}

		System.out.println("Result ==>" + sbword);

		/////////////////////////////////////////////////////////////////////////

	}
}
