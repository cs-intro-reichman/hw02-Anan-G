/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		String gender = "";
		int index = 1;
		int num2Ch = 0;
		int num3Ch = 0;
		int num4Ch = 0;
		int sum = 0;
		int sum2;
		double average;
		
		for (int i = 0; i < T; i++){
			
			sum2 = 0;

				while(true) {			
			
					if (Math.random() < 0.5) {
			
						gender += "g ";

							} else {
			
								gender += "b ";
			
							}
			
					sum2++;
					sum++;
		
					if (index >= 3){

						if (gender.charAt(index - 1) != gender.charAt(index - 3)) {
				
							if (sum2 == 2) {

								num2Ch++;
								break;

								}  
					
							if (sum2 == 3) {

								num3Ch++;
								break;

								} 

							if (sum2 >= 4) {
						
								num4Ch++;
								break;
						
								}
						
					
							}
	
						}
			
					index += 2;

				}
		}	
	

		average = (double) sum/T;

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num2Ch);
		System.out.println("Number of families with 3 children: " + num3Ch);
		System.out.println("Number of families with 4 or more children: " + num4Ch);

		int mostCommon = Math.max(Math.max(num2Ch, num3Ch), num4Ch);
			
		if (num2Ch == mostCommon) {
			
			System.out.println("The most common number of children is 2.");

		}

		else if (num3Ch == mostCommon) {

			System.out.println("The most common number of children is 3.");
			
		}

		else if (num4Ch == mostCommon) {

			System.out.println("The most common number of children is 4 or more.");

		}
	}
}
