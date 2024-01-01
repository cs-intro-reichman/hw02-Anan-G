/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {

	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int div = 2;
		int sum = 1;
		String str = "";
		
		
		while (div < num) { 
			
			if (num % div == 0) {
				
				sum += div;
				str += " + " + div;
				
			} 
				
			div++;
			
		}
		

		if (sum == num) {
			
			System.out.println(num + " is a perfect number since " + num + " = 1" + str);
			
			
		} else {
			
			System.out.println(num + " is not a perfect number");
			
		}
	}
}
