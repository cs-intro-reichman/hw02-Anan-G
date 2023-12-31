/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
		String str = args[0];
		String str2 = "";
		int n = str.length();
		char midChar = str.charAt((n-1)/2); 

		
		for (int i = n-1; i >= 0; i--) {
			
			str2 += str.charAt(i);
			
		}
		
		System.out.println(str2);
		System.out.println("The middle character is " + midChar);

	}
}
