/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int randNum, randNum2, prevNum, prevNum2;

		randNum = (int)(Math.random()*10);
		System.out.print(randNum);

		do{

			randNum2 = (int)(Math.random()*10);	

			if (randNum <= randNum2) {

				System.out.print(" " + randNum2);

			} else {
				
				break;

			}	
			
			prevNum = randNum;
			prevNum2 = randNum2;

			randNum = randNum2;

		} while (prevNum <= prevNum2);

	}
}
