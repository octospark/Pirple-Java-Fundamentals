package package1;


public class Homework5 {
	public static void main(String[] args) {
		System.out.println(reverseString("Java Programming"));
		System.out.println(isPalindrome("rotor"));
		
		for (int i = 0; i < 25; i++)
			System.out.print(randBetween(10, 15) + " ");
	}
	
	public static String reverseString(String string) {
		String newStr = "";
		for (int i = 0; i < string.length(); i++) {
			newStr = string.charAt(i) + newStr;
		}
		return newStr;
	}
	
	/*Using the reverseString function, determining if a string is a palindrome
	 * becomes easier*/
	public static boolean isPalindrome(String string) {
		String reversed = reverseString(string);
		return reversed.equals(string);
	}
	
	/*The Math.random() function returns a double random value ranging from 0.0 to 0.999..
	 * To return an int value between min and max we can use this function like below*/
	public static int randBetween(int min, int max) {
		return (int)Math.round(min + Math.random() * (max - min));
	}
}






