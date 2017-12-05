import java.util.ArrayList;

/**
 * Contains is a class that checks a range of numbers to see which numbers contain a certain digit. 
 * @author Ellen Sutton
 * @version 26/10/2017
 *
 */


public class Contains {

	/**
	 * 
	 * allIntegersWith is a method that checks all digits of the numbers in a certain range for a particular digit
	 * @param from The start of the range of numbers to check between (inclusive)
	 * @param to The end of the range of numbers to check between (exclusive)
	 * @param containedDigit The digit that we are checking for
	 * @return All numbers in the given range that contain the digit
	 */
	public static ArrayList<Integer> allIntegersWith(int from, int to, int containedDigit){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int currentNumber=from; currentNumber<to; currentNumber++){
			int number = currentNumber;
			if (number < 0){
				number = -number;
			}
			if (number == 0 && containedDigit == 0){ 
				answer.add(currentNumber);
			}
			while (number!=0){
			int digit = number%10;
			if (digit == containedDigit){
				answer.add(currentNumber);
				number=0;
			}
			number = number/10;	
			}
			 
		}
		return answer;
	}
			
	
	
}
