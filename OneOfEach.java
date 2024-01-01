
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		String gender = "";	
		int index = 1;
		int sum = 0;

		while(true) {			

			if (Math.random() < 0.5) {
			
				gender += "g ";

					} else {
			
						gender += "b ";
			
					}
			
			
			sum ++;
		
			if (index >= 3){

				if (gender.charAt(index - 1) != gender.charAt(index - 3)) {
				
					System.out.println(gender);
					System.out.println("You made it... and you now have " + sum + " children.");
					break;
					
					}
	
				}
			
			index += 2;

			}
		}
	}
