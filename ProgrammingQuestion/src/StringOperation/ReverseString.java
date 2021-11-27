package StringOperation;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close(); // closes the input stream
		String reversed = reverseString(str);
		System.out.println("The reversed string is: " + reversed);
		
		String reversed2 = reverseStr(str);
		System.out.println("The reversed string 2 is: " + reversed2);
	}

	private static String reverseStr(String str) {
		String r="";
		for(int i=str.length();i>0;--i) {
			r=r+(str.charAt(i-1));
		}
		return r;
	}

	public static String reverseString(String s) {
		if (s.isEmpty()) // checks the string if empty
			return s;
		return reverseString(s.substring(1)) + s.charAt(0); // recursively called function
	}

}
