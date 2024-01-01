/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int div = 1;
		
		while (div < num) { 
			
			if (num % div == 0) {

				System.out.println(div);

			}

			div++;
			
		}
		
		System.out.println(num);
	}
}
